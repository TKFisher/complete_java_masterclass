package com.Section_8_Polymophism;

// Base class
class Car {
    private int cylinders;
    private String name;
    private int wheels = 4;
    private boolean engine = true;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getCylinders() {
        System.out.println("There are " + cylinders + " cylinders.");
        return cylinders;
    }

    public String getName() {
        System.out.println("This is a " + name + " .");
        return name;
    }

    // Three ways to create your methods.
    public void startEngine() {
        System.out.println("The base car engine starts.");
    }

    public String accelerate() {
        return getClass().getSimpleName() + "accelerates.";
    }

    public String brake() {
       return "The base car brakes.";
    }

}

// Vehicle sub classes
class Toyota extends Car {

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        //super.startEngine();
        System.out.println("The Toyota engine starts.");
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates.";
    }

    @Override
    public String brake(){
        return "The Toyota brakes.";
    }
}


public class MainChallenge {

    public static void main(String[] args) {

        System.out.println("***** Challenge **** ");

        // Put all classes in one java file in Main to demonstrate that you can have more than one class in a file.
        // Create a base class called Car.
        // It should have a few fields that would be appropriate for a generic Car class:
        //   engine, cylinders, wheels etc.
        // The constructor should initialize cylinders (number of), name, set wheels to 4,
        //    and set engine to true.
        // The cylinders and names would be passed parameters.
        // Create appropriate getters.
        // Create some methods like startEngine, accelerate, and brake.
        // Show a message for each in the base class.
        // Create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demostrate polymorphism is use.


        Car myCar = new Car(2, "no-brand car");
        myCar.getName();
        myCar.startEngine();
        System.out.println(myCar.accelerate());
        myCar.getCylinders();
        System.out.println(myCar.brake());

        System.out.println("*** " );

        Toyota myToyota = new Toyota(6, "T-100");
        myToyota.getName();
        myToyota.startEngine();
        System.out.println(myToyota.accelerate());
        myToyota.getCylinders();
        System.out.println( myToyota.brake());


    }



}
