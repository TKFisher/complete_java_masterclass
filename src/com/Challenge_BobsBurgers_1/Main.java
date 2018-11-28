package com.Challenge_BobsBurgers_1;


public class Main
{

    public static void main(String[] args)
    {

        // Bill's Burger Challenge:
        // Our application will help Bill to select types of burgers, some of the additional items (healthAdditions) to
        // be added to the burgers and pricing. We want to create a base hamburger, but also two other types of
        // hamburgers that are popular ones in Bills store.
        //
        // The basic hamburger should have the following items: bread roll type, meat and up to 4
        // additional healthAdditions (things like lettuce, tomato, carrot, etc) that the customer can add to the burger.
        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the price (for the base burger and all the healthAdditions). This burger has a base price and the
        // healthAdditions are all separately priced.  Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price.
        //
        // Also create two extra varieties of Hamburgers (classes) to cater for:
        //      a) Healthy burger (on a brown rye bread roll), plus two addition items can be added. The healthy burger
        //         can have a total of 6 items (Additions) in total. Hint:  you probably want to process the 2 additional
        //         items in this new class, not the base class, since the 2 healthAdditions are only appropriate for this new class.
        //      b) Deluxe hamburger - comes with chips and drinks as healthAdditions, but no extra healthAdditions are allowed.
        //         Hint:  You have to find a way to automatically add these new healthAdditions at the time the deluxe burger
        //         object is created, and then prevent other healthAdditions being made.
        //
        // All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all healthAdditions, each showing the addition name, and addition price, and a grand total for the burger.
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals onto that.


        BaseBurger burger1 = new BaseBurger("roll",true);
        burger1.getCost();
        burger1.costOfAdditions(1,true,true,true,true);
        burger1.getCost();


        //        HealthyBurger burgerHealthy1 = new HealthyBurger(new BaseBurger("brown rye roll", true),
        //                true, true);

        //burgerHealthy1.costOfHealthyBurgerWithAdditions(true, true);


    }
}
