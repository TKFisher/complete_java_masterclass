package com.Section_8_Arrays;


public class While_Challenge
{


    public static void main(String[] args)
    {

        // simple check of one value passed as a parameter.
        // isEvenNumber(100);

        // test a range of numbers:
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber)
        {
            if (isEvenNumber(number))
            {
                System.out.println("This number: " + number + " is even.");
                number++;

            } else if (!isEvenNumber(number))
            {
                System.out.println("This number: " + number + " is odd.");
                number++;
                continue;
            }
        }
    }

    public static boolean isEvenNumber(int number)
    {

        // x % 2 == 0  is even ( x / 2 = a whole number)
        // else odd

        while (number % 2 == 0)
        {
            System.out.println("The value of " + number + " is even.");
            return true;
        }
        System.out.println("The value of " + number + " is odd.");
        return false;
    }
}
