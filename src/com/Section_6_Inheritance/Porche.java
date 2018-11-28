package com.Section_6_Inheritance;

/*
 * specific to porche:
 *
 *
 *
 *
 * */

public class Porche extends Car
{

    private int roadServiceMonths;

    // constructor:  we've hard coded all params except one.
    public Porche(int roadServiceMonths)
    {
        super("Porche 911","580 hp",5,2,7,false);
        this.roadServiceMonths = roadServiceMonths;
    }

    // for the sake of this test we set the gear to automatic above by making isManual = false
    // so we need to have a param that will change the gears for us automatically based on speed.
    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0)
        {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10)
        {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20)
        {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30)
        {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40)
        {
            changeGear(5);
        } else if (newVelocity > 40 && newVelocity <= 50)
        {
            changeGear(6);
        } else
        {
            changeGear(7);
        }

        if (newVelocity > 0)
        {
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}
