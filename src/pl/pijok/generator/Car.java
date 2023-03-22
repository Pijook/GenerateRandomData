package pl.pijok.generator;

public class Car {

    private final String color;
    private final double speed;
    private final double weight;
    private final double price;

    public Car(String color, double speed, double weight, double price) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return speed + "," + weight + "," + price + "," + color;
    }
}
