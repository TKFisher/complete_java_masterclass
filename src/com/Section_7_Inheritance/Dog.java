package com.Section_7_Inheritance;


public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Constructor:  After creating the generic constructor we did the following:
    //  - removed both "int brain", and "int body" as parameters and initialized them with the number "1" because
    //    we know that all dogs have one brain and one body so we don't need to force these as parameters.
    //  - we added the private variables as parameters because these are things that will be unique to all dogs.
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);

        // initializing the added params. Note: the other params were initialized within the Animal class already.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        // calling the "move" method from Animal and specifying speed of dog here.
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called.");
         move(10);
    }


}
