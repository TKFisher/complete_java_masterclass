package com.Section_6_Inheritance;


public class Main
{

    public static void main(String[] args)
    {


        Animal animal1 = new Animal(1,1,5,5,"animal");

        Dog dog = new Dog(5,15,"Yorkie",2,4,1,20,"silky");

        dog.eat();
        dog.walk();
        dog.run();

        System.out.println(" *************** Challenge 1 ********** ");

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Porche myPorche = new Porche(36);
        myPorche.steer(45);
        myPorche.accelerate(30);
        myPorche.accelerate(50);
        myPorche.steer(-45);
        myPorche.accelerate(-33);
        myPorche.stop();

    }

}
