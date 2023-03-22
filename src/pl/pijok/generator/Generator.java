package pl.pijok.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {


    public static void main(String[] args) {

        List<CarModel> models = new ArrayList<>();

        CarModel redModel = new CarModel("Red", 1.0, 3.0, 100.0, 150.0, 5000.0, 10000.0);
        CarModel yellowModel = new CarModel("Yellow", 2.0, 4.0, 150.0, 300.0, 7000.0, 15000.0);
        CarModel blueModel = new CarModel("Blue", 0.5, 1.0, 70.0, 150.0, 1000.0, 2000.0);

        models.add(redModel);
        models.add(yellowModel);
        models.add(blueModel);

        int amount = 50;
        Random random = new Random();

        for(int i = 0; i < amount; i++) {
            CarModel model = models.get(random.nextInt(models.size()));
            System.out.println(model.generateCar());
        }

    }

}
