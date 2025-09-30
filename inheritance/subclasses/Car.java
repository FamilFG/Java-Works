package inheritance.subclasses;

import inheritance.Vehicle;

public class Car extends Vehicle {

    public Car(int speed, String color) {
        super(speed, color);
    }

    public void drive() {
        System.out.println("Speed: " + speed + " Color: " + color);
    }
}
