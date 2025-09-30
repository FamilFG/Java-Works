package inheritance.subclasses;

import inheritance.Vehicle;

public class Bike extends Vehicle {

    public Bike(int speed, String color) {
        super(speed, color);
    }

    public void drive() {
        System.out.println("Speed: " + speed + " Color: " + color);
    }

}
