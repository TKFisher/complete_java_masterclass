package com.Challenge_BobsBurgers_1;


public class BaseAdditions {

    private int extraBeef = 0;
    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean pickles = false;
    private double cost;


    public  BaseAdditions(int addExtraBeef, boolean addCheese, boolean addLettuce, boolean addTomato, boolean addPickles) {

        double additionalCost = 0;
        double beefUnitCost = 1.0;

        if (addExtraBeef > 0) {
            this.extraBeef += addExtraBeef;
            System.out.println("includes " + addExtraBeef + " extra beef");
            additionalCost += extraBeef * beefUnitCost;
        }
        if (addCheese) {
            this.cheese = addCheese;
            System.out.println("includes cheese");
            additionalCost += .50;
        }
        if (addLettuce) {
            this.lettuce = addLettuce;
            System.out.println("includes lettuce");
            additionalCost += .25;
        }
        if (addTomato) {
            this.tomato = addTomato;
            System.out.println("includes tomato");
            additionalCost += .25;
    }
        if (addPickles) {
        this.pickles = addPickles;
        System.out.println("includes pickles");
        additionalCost += .25;
    }

        System.out.println("Additions = " + additionalCost);
        this.cost += additionalCost;
    }

    public double getCost() {
        return cost;
    }


    public double costBaseAdditions(int addExtraBeef, boolean addCheese, boolean addLettuce, boolean addTomato, boolean addPickles){

        double additionalCost = 0;
        double beefUnitCost = 1.00;

        if (addExtraBeef > 0) {
            this.extraBeef += addExtraBeef;
            additionalCost += extraBeef * beefUnitCost;
        }
        if (addCheese) {
            this.cheese = addCheese;
            System.out.println("includes cheese");
            additionalCost += .50;
        }
        if (addLettuce) {
            this.cheese = addLettuce;
            System.out.println("includes lettuce");
            additionalCost += .25;
        }
        if (addTomato) {
            this.cheese = addTomato;
            System.out.println("includes tomato");
            additionalCost += .25;
        }
        if (addPickles) {
            this.cheese = addPickles;
            System.out.println("includes pickles");
            additionalCost += .25;
        }
        this.cost += additionalCost;
        System.out.println("Total base additions come to " + additionalCost);
        System.out.println("Total cost of base burger comes to " + this.cost);
        return this.cost;
    }

}
