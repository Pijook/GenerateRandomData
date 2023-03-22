package pl.pijok.generator;

import java.util.Random;

public class CarModel {

    public Car generateCar() {
        return new Car(
                this.color,
                randomDoubleInRange(minSpeed, maxSpeed),
                randomDoubleInRange(minWeight, maxWeight),
                randomDoubleInRange(minPrice, maxPrice)
        );
    }

    private static double randomDoubleInRange(double rangeMin, double rangeMax){
        Random r = new Random();
        double value = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        value = value * 100;
        value = (int) value;
        value = value / 100;
        return value;
    }

    private final String color;
    private final double minSpeed;
    private final double maxSpeed;

    private final double minWeight;
    private final double maxWeight;

    private final double minPrice;
    private final double maxPrice;

    public CarModel(String color, double minSpeed, double maxSpeed, double minWeight, double maxWeight, double minPrice, double maxPrice) {
        this.color = color;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public double getMinSpeed() {
        return minSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public String getColor() {
        return color;
    }
}
