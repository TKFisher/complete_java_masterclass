package com.Section_7_Inheritance;

/**
 * types of cars:
 * 2 door or 4 door
 * gear type:  convertible * automatic or manual
 * 4 wheel drive
 * engine size is 2/4 cycle; v6/8; turbo
 */

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    // constructor: we've hard coded one param, the currentGear, param.
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // over ride the move method from Vehicle class with:
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear():  Change to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity:  Velocity is "  + speed + " direction " + direction);
        move(speed, direction);
    }


}
