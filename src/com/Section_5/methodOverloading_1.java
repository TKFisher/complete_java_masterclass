package com.Section_5;


public class methodOverloading_1
{

    public static void main(String[] args)
    {
        //        int newScore = calculateScore("Tracy", 10);
        //        System.out.println("New score is " + newScore);
        //        //Overloaded methods:
        //        calculateScore(75);
        //        calculateScore();

        //calcFeetAndInchesToCentimeters(2, 12);
        double value = calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(6,13));
        if (value < 0.0)
        {
            System.out.println("Invalid parameter.");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches)
    {

        double inchesInCent = 2.54;
        // 1 inch = 2.54 cm
        // 1 foot = 12 inches

        if ((feet >= 0) && ((inches > 0) && (inches < 12)))
        {
            double totalInCent = ((feet * 12) + inches) * inchesInCent;
            System.out.println(feet + " feet, " + inches + " inches = " + totalInCent);
            return totalInCent;
        } else System.out.println("Value is outside of requirements.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches >= 0)
        {
            double totalInFeet = (inches / 12);
            System.out.println(inches + " inches = " + totalInFeet + " feet.");
            return 0;
        }
        System.out.println("Value is outside of requirements for overloaded method.");
        return -1;
    }


    public static int calculateScore(String playerName,int score)
    {
        System.out.println("Player2 " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // This is a copy of the above method using the same name. To use a method with the same name you
    // need to change the number of parameters being passed or you will get an error.  This is called
    // overloading a method.
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player " + score + " points.");
        return score * 1000;
    }

    // another overloaded method with no parameters.
    public static int calculateScore()
    {
        System.out.println("An unnamed player without a score.");
        return 0;
    }

    // Note:  you cannot have a method in this case that returns a void....

}
