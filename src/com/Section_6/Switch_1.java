package com.Section_6;


public class Switch_1
{

    public static void main(String[] args)
    {

        int switchValue = 4;

        switch (switchValue)
        {

            case 1:
                System.out.println("Value was 1.");
                break;
            case 2:
                System.out.println("Value was 2.");
                break;
            // A shorthand way.
            case 3:
            case 4:
            case 5:
                System.out.println("Value is either 3, 4, or 5.");
                // see what happens when you remove a "break" statement.
                break;
            default:
                System.out.println("Value was greater than 5.");
                System.out.println("Value was " + switchValue);
                break;
        }

        // Challenge
        // create a switch statement using a char instead of an int.
        // create a new char variable.
        // create a switch statement testing for A, B, C, D, or E
        // display a message if any of these are found and then break.
        // add a default statement stating that the value was not found.

        char myCharVar = 'A';

        switch (myCharVar)
        {
            case 'A':
                System.out.println(myCharVar + " was found.");
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value B, C, D or E were found.");
                break;
            default:
                System.out.println("Neither A, B, C, D, and E were found.");
        }

        // Example using a String and the method toLowerCase()
        String month = "JAnuarY";
        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("The month is " + month);
                break;
            case "june":
                System.out.println("The month is " + month);
                break;
            default:
                System.out.println("The month is some other month.");
                break;
        }


    }
}




