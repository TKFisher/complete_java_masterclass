package com.Section_9;


/**
 * You can use the If or the Switch statement as they are basically the same.  The differences are that the If
 * statement is more flexible as you can use different variables in each If block where as with the Switch statement
 * you are testing only different values of the same variable.
 *
 */
public class Switch_Example {

    public static void main(String[] args) {

        // Basic If Statement.
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value equals 1.");
//        } else if (value == 2) {
//            System.out.println("Value is 2.");
//        } else {
//            System.out.println("Value is not 1 or 2");
//        }

        // Basic Switch Statement.
        int switchValue = 5;

        switch (switchValue) {
            case 1: {
                System.out.println("Value is 1.");
                break;
            }
            case 2: {
                System.out.println("Value is 2.");
                break;
            }
            // you can stack them like this too.
            case 3:case 4:case 5: {
                System.out.println("The values was " + switchValue + ".");

                break;
            }
            default:
                System.out.println("Is not 1, 2, 3, 4, or 5.");
                // this break is the only one you technically don't need, but it's good practice to always use them.
                break;
        }
    }


}
