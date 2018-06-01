package com.Challenge_BobsBurgers_1;



public class HealthyBurger {

    private BaseBurger base;
    private boolean avocado;
    private boolean spinach;
    private double baseHealthCost;
    private double totalCost;


    public HealthyBurger(BaseBurger base, boolean avocado, boolean spinach) {
        this.base = base;
        this.avocado = avocado;
        this.spinach = spinach;
        //this.baseHealthCost = baseHealthCost;
        //this.totalCost = this.base.getCost() + this.baseHealthCost;
        this.baseHealthCost = baseHealthCost;
    }

    public double getBaseHealthCost(){
        return  this.baseHealthCost;
    }

    public double getTotalCost() {
        this.totalCost = baseHealthCost + base.getCost();
        return this.totalCost;
    }

    public double costOfHealthyBurgerWithAdditions(boolean addAvocado, boolean addSpinach) {

        double additionalCost = 0;

        if (addAvocado) {
            this.avocado = addAvocado;
            additionalCost += .75;
        }
        if (addSpinach) {
            this.spinach = addSpinach;
            additionalCost += .50;
        }

        totalCost += this.baseHealthCost += additionalCost;
        System.out.println("Additions come to " + additionalCost + ". The total burger costs " +  this.totalCost);
        return totalCost;
    }



}
