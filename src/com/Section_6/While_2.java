package com.Section_6;


import static java.lang.Integer.sum;

public class While_2 {

    public static void main(String[] args) {

        System.out.println("******************** Example of Do While Loop");

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            // With Do While we have to increment the loop manually like this where as in the For Loop it's done
            // automatically within the first statement.
            count++;
        }

        System.out.println(" **************** Example of For Loop");

        for (int i = 1; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        System.out.println(" **************** Example of While Loop but done in a different way using 'true'.");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println(" **************** Example of Do While Loop");
        // The print statement will always execute at least once.  See what happens
        // when you run it without the 'count' variable being initialized to 1 and the 'count++" commented out.

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println(" **************** Example of Do While Loop with break statement.");
        // If I add a 'break' statement it will get us out of the loop.

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 10) {
                break;
            }
        } while (count != 6);

        System.out.println(" **************** Challenge 1:  ");
        // Create a method called isEvenNumber that takes a parameter of type int.
        // Its purpose is to determine if the argument passed to the method is an
        // even number or not.
        // Return true if an even number, otherwise return false;
        // Hint:  use Remainder operator.

        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }

        System.out.println(" **************** Challenge 2:  ");
        // Modify the while code above.
        // Make it also record the total number of even numbers it has found
        // and break out of the loop once 5 are found.
        // Return true if an even number, otherwise return false.

        int number2 = 5;
        int finishNumber2 = 20;
        int totalEvenFound = 0;
        while (number2 <= finishNumber2){
            if(!isEvenNumber(number2)){
                number2++;
                continue;
            }if (isEvenNumber(number2)) {
                totalEvenFound++;
                System.out.println("Even number " + number2 );
                //System.out.println("Total numbers found is " + totalEvenFound);
                number2++;
                if(totalEvenFound >= 5){
                    System.out.println("Total even numbers found is " + totalEvenFound);
                    break;
                }}}
    }

    // Methods
    public static boolean isEvenNumber(int y) {

//        16 % 2 = 0    OR:    15 % 2 = 1
//        if x == 0 the value for y is even
//        if x < 0 the value for y is odd

        if ((y % 2) == 0) {
            return true;
        }else
            return false;
    }


}
