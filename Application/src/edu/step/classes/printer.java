package edu.step.classes;

public class printer {
        private String brand;
        private boolean isOn;

        
        public void turnOn() {
            isOn = true;
            System.out.println("Printerul s-a pornit");
        }

        public void print(String document) {
            if (isOn) {
                System.out.println("Printam " + document);
            } else {
                System.out.println("Printerul este stins");
            }
        }
}
