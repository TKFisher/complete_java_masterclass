package com.Challenge_BobsBurgers_2;

public class DeluxBurger extends BaseBurger {


    public DeluxBurger() {
        super("Delux Burger", " 2 beef patties", 8.5, "sour dough");
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("a coke", 0);
    }

    // User Overrides to prevent additional items from access.
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items. ");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items. ");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items. ");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items. ");
    }
}
