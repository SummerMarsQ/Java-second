package edu.step.classes;

public class car {

    private String brand;
    private String color;

    // Методы класса
    public void start() {
        System.out.println("Masina " + brand + " s-a pornit");
    }

    public void drive(int speed) {
        System.out.println("Masina " + brand + " merge cu viteza " + speed + "km/h");
    }

}
