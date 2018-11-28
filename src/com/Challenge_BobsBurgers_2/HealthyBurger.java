package com.Challenge_BobsBurgers_2;

public class HealthyBurger extends BaseBurger
{

    private String extraName1;
    private double extraPrice1;

    private String extraName2;
    private double extraPrice2;


    public HealthyBurger(String meat,double price)
    {
        super("Healthy Burger",meat,price,"brown rye");
    }

    public void addHealthAddtion1(String name,double price)
    {
        this.extraName1 = name;
        this.extraPrice1 = price;
    }

    public void addHealthAddtion2(String name,double price)
    {
        this.extraName2 = name;
        this.extraPrice2 = price;
    }

    @Override
    public double costOfBurgerWithAdditions()
    {
        double hamburgerPrice = super.costOfBurgerWithAdditions();

        if (this.extraName1 != null)
        {
            hamburgerPrice += this.extraPrice1;
            System.out.println("Added " + this.extraName1 + " for an extra " + this.extraPrice1);
        }

        if (this.extraName2 != null)
        {
            hamburgerPrice += this.extraPrice2;
            System.out.println("Added " + this.extraName2 + " for an extra " + this.extraPrice2);
        }

        System.out.println("Your final total with healthy extra additions comes to: " + hamburgerPrice);
        return hamburgerPrice;
    }

}
