package edu.step.classes;

public class telefon {
    double batteryPercent;
    double price;
    boolean turned;
    public void turnOff()
    {
        if(batteryPercent == 0) this.turned = false;
    }
    public void makeDiscount()
    {
        this.price = price * 0.9;
    }
}
