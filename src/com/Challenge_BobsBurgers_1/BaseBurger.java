package com.Challenge_BobsBurgers_1;

public class BaseBurger
{


    // Base ingredients
    private String breadType;
    private int beefPatty;
    private boolean specialSauce = true;
    private double baseCost = 2.00;
    private int extraBeef = 0;
    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean pickles = false;


    // Constructor
    public BaseBurger(String breadType,boolean specialSauce)
    {
        this.breadType = "roll";
        this.beefPatty = 1;
        this.specialSauce = specialSauce;
        this.baseCost = baseCost;
    }


    public double getCost()
    {
        System.out.println("Base burger =  " + baseCost);
        return baseCost;
    }


    public double costOfAdditions(int addExtraBeef,boolean addCheese,boolean addLettuce,boolean addTomato,boolean addPickles)
    {

        double additionalCost = 0;
        double beefUnitCost = 1.0;

        if (addExtraBeef > 0)
        {
            this.extraBeef += addExtraBeef;
            System.out.println("includes " + addExtraBeef + " extra beef");
            additionalCost += extraBeef * beefUnitCost;
        }
        if (addCheese)
        {
            this.cheese = addCheese;
            System.out.println("includes cheese");
            additionalCost += .50;
        }
        if (addLettuce)
        {
            this.lettuce = addLettuce;
            System.out.println("includes lettuce");
            additionalCost += .25;
        }
        if (addTomato)
        {
            this.tomato = addTomato;
            System.out.println("includes tomato");
            additionalCost += .25;
        }
        if (addPickles)
        {
            this.pickles = addPickles;
            System.out.println("includes pickles");
            additionalCost += .25;
        }
        baseCost += additionalCost;
        return addExtraBeef;
    }

    public int getExtraBeef()
    {
        return extraBeef;
    }

    public boolean isCheese()
    {
        return cheese;
    }

    public boolean isLettuce()
    {
        return lettuce;
    }

    public boolean isTomato()
    {
        return tomato;
    }

    public boolean isPickles()
    {
        return pickles;
    }
}
