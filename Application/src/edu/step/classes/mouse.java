package edu.step.classes;

public class mouse {

    private String brand;
    private int buttonsCount;

    public void click() {
        System.out.println("A fost facut un click");
    }

    public void move(int x, int y) {
        System.out.println("Mouse-ul s-a mutat pe coordonatele (" + x + ", " + y + ")");
    }
}
