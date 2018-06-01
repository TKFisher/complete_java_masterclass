package com.Challenge_BobsBurgers_1;

public class HealthyAdditions {

    private boolean avocado = false;
    private boolean spinach = false;
    private boolean sprouts = false;
    private double cost;

    public HealthyAdditions(boolean addAvocado, boolean addSpinach) {
        this.avocado = avocado;
        this.spinach = spinach;
        double additionalCost = 0;

        if (addAvocado) {
            this.avocado = addAvocado;
            System.out.println("includes avocado");
            additionalCost += .75;
        }
        if (addSpinach) {
            this.sprouts = addSpinach;
            System.out.println("includes spinach");
            additionalCost += .25;
        }

        System.out.println("Additions = " + additionalCost);
        this.cost += additionalCost;
    }


    public double getCost() {
        return cost;
    }


    public double costHealthAdditions(boolean addAvodado, boolean addSpinach, boolean addSprouts) {

        double additionalCost = 0;

        if (avocado) {
            this.avocado = addAvodado;
            System.out.println("includes avocado");
            additionalCost += 1.00;
        }
        if (addSpinach) {
            this.spinach = addSpinach;
            System.out.println("includes spinich");
            additionalCost += .25;
        }
        if (addSprouts) {
            this.sprouts = addSprouts;
            System.out.println("includes sprouts");
            additionalCost += .50;
        }
        this.cost = additionalCost;
        System.out.println("Total healthAdditions come to " + additionalCost);
        System.out.println("Total cost of burger comes to " + this.cost);
        return this.cost;
    }

}
