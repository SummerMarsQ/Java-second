package edu.step.classes;

public class calculator {
    String username;
    boolean turned;
    String cpu;

    public void turn() {
        this.turned =!turned;
}

    public void CPU(){
        System.out.println("Cpu is "+this.cpu);
    }
}
