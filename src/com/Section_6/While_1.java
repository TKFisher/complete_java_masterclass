package com.Section_6;


public class While_1
{

    public static void main(String[] args)
    {

        System.out.println("10,000 at 2%  interest = $" + calculateInterest(10000,2.0));
        System.out.println("10,000 at 3%  interest = $" + calculateInterest(10000,3.0));
        System.out.println("10,000 at 4%  interest = $" + calculateInterest(10000,4.0));
        System.out.println("10,000 at 5%  interest = $" + calculateInterest(10000,5.0));

        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Loop " + i + " hello. ");
        }

        // Challenge 1
        System.out.println("*********************** Challenge 1 output: ");

        // using the for statement example above, call the calculateInterest method with
        // the amount of 10,000 and an interest rate of 2, 3, 4, 5, 6, 7 and 8 percent
        // and print out the results to the console window.

        for (int i = 2; i < 9; i++)
        {

            // System.out.println("10,000 at " + i + " is  $" + calculateInterest(10000, i));
            // this gets rid of the training zeros for the 7% calculation.
            System.out.println("10,000 at " + i + " is  $" + String.format("%.2f",calculateInterest(10000,i)));
        }

        // Challenge 2
        System.out.println("*********************** Challenge 2 output: ");

        // Reverse the above and decrease from 8% to 2%.

        for (int i = 8; i >= 2; i--)
        {
            System.out.println("10,000 at " + i + " is  $" + String.format("%.2f",calculateInterest(10000,i)));
        }

        // Challenge 3 - this does not work for me

        System.out.println("*********************** Challenge 3 output: ");

        for (int i = 8; i >= 2; i--)
        {
            //System.out.println("10,000 at " + i + "% interest = " + (calculateInterest(10000.0, i)));
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++)
        {
            if (isPrime(i))
            {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10)
                {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    // *********************  Methods:
/*
    A prime number is a whole number (no remainder) divisible by exactly 2 whole numbers, of which one of the numbers is 1 and the other is itself.
    If it can be divided by more than 2 whole numbers then it's not prime (ex 4 is divisible by 1, 4, and 2). One is not prime because
    it can only be divisible by one number. Two is the only even number that is prime. It can be divisible by 1 and 2 only.
*/
    public static boolean isPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }
        // Note:  if the remainder between n and i = zerox`x    x   , it means there is no remainder which means we've found
        // another number that divides evenly into the number that was passed and therefor this can't be a prime number.
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount,double interest)
    {
        return (amount * (interest / 100));
    }


}
