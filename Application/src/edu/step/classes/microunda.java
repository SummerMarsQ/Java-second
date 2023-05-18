package edu.step.classes;

public class microunda {

    private String brand;
    private int power;

    public void heatFood(int timeInSeconds) {
        System.out.println("Incalzim mancarea " + timeInSeconds + " secunde");
    }

    public void setPower(int power) {
        this.power = power;
        System.out.println("Puterea microundei s-a facut " + power );
    }

}
