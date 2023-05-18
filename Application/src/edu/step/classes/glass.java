package edu.step.classes;

public class glass {

    private String material;
    private int capacity;

    public void fill() {
        System.out.println("Paharul din " + material + " este plin");
    }

    public void drink() {
        System.out.println("S-a baut " + capacity + " ml");
    }
}
