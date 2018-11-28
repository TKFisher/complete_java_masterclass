package com.Challenge_BobsBurgers_2;

public class BaseBurger
{

    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;


    public BaseBurger(String name,String meat,double price,String breadType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addHamburgerAddition1(String name,double price)
    {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name,double price)
    {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name,double price)
    {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name,double price)
    {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double costOfBurgerWithAdditions()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name = "The base price of your " + this.name + " with " + this.meat + " on " + this.breadType + " costs " + hamburgerPrice);

        if (this.additionName1 != null)
        {
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added " + this.additionName1 + " for an extra " + this.additionPrice1);
        }

        if (this.additionName2 != null)
        {
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added " + this.additionName2 + " for an extra " + this.additionPrice2);
        }

        if (this.additionName3 != null)
        {
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added " + this.additionName3 + " for an extra " + this.additionPrice3);
        }

        if (this.additionName4 != null)
        {
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added " + this.additionName4 + " for an extra " + this.additionPrice4);
        }

        System.out.println("Your total with base addtions: " + hamburgerPrice);
        return hamburgerPrice;
    }

}


