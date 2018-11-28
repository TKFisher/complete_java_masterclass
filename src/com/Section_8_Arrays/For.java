package com.Section_8_Arrays;


public class For
{

    public static void main(String[] args)
    {

        //System.out.println("10,000 at 2% = " + calculateInterest(10000, 2));

        //        System.out.println("\r **************** ");
        //        for (int i = 0; i < 5; i++){
        //            System.out.println("Loop " + i + " hello.");
        //        }
        //
        //        System.out.println("\r Challenge  1 **************** ");
        //        for (int i = 2; i <= 8; i++) {
        //            double amount = 10000;
        //            double rate = i;
        //            System.out.println("Tracy's interest on $10,000 at " + rate + "% is " + calculateInterest(amount, rate));
        //        }
        //        System.out.println("\r **************** ");
        //
        //        // Tim's way for the above:
        //        for (int i = 2; i < 9; i++) {
        //            //System.out.println("Tim's interest on $10,000 at " + i + "% is " + calculateInterest(10000.0, i));
        //            System.out.println("Tim's interest on $10,000 at " + i + "% is " + String.format("%.2f", calculateInterest(10000.0, i)));
        //        }
        //
        //        System.out.println("\r Second Challenge **************** ");
        //
        //        for (int i = 8; i >= 2; i--) {
        //            System.out.println("Interest on $10,000 at " + i + "% is " + String.format("%.2f", calculateInterest(10000.0, i)));
        //        }

        isPrime(0);
        //findRemainder(10, 3);

        //        int count = 0;
        //        for (int i = 10; i <= 50; i++) {
        //            if (isPrime(i)) {
        //                count++;
        //                //System.out.println("Number " + i + " is a prime number.");
        //                if (count ==3){
        //                    System.out.println("You've found 3 prime values. Exiting Loop.");
        //                    break;
        //                }}}

    }

    // A Prime Number can be divided evenly only by 1 or itself.
    public static boolean isPrime(int n)
    {

        //if (n == 1) {  -- original line from course.
        if (n == 1 || n == 0)
        {
            System.out.println(n + " is not a prime number.");
            return false;
        }

        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                System.out.println(n + "Hey, what happened here?");
                return false;
            }
        }

        System.out.println(n + " is a Prime number.");
        return true;
    }

    // the modulus or remainder operator (%) returns the remainder of two numbers. (ex 10 % 3 = 1)
    public static int findRemainder(int i,int j)
    {

        System.out.println("i is " + i);
        System.out.println("j is " + j);
        int k = i % j;
        System.out.println("i % j is " + k);

        return k;

    }

    public static double calculateInterest(double amount,double interestRate)
    {

        return (amount * (interestRate / 100));
    }
}
