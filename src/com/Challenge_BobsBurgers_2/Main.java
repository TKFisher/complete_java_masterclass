package com.Challenge_BobsBurgers_2;

public class Main {

    public static void main(String[] args) {

        System.out.println("********** Regular Burger \n");

        BaseBurger burger1 = new BaseBurger("Hamburger", "beef", 2.00, "white");
        burger1.addHamburgerAddition1("cheese", 1.00);
        burger1.addHamburgerAddition2("bacon", 1.5);
        burger1.costOfBurgerWithAdditions();

        System.out.println("********** Healthy Burger \n");

        HealthyBurger healthyBurger1 = new HealthyBurger("veggie patti", 5.45);
        healthyBurger1.addHamburgerAddition1("cheese", 1.00);
        healthyBurger1.addHealthAddtion1("egg", .50);
        healthyBurger1.costOfBurgerWithAdditions();

        System.out.println("********** Delux Burger \n");

        DeluxBurger deluxBurger1 = new DeluxBurger();
        deluxBurger1.addHamburgerAddition1("more cheese", 1.00);
        deluxBurger1.costOfBurgerWithAdditions();





    }
}
