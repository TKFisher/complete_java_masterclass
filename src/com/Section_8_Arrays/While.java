package com.Section_8_Arrays;


public class While
{

    public static void main(String[] args)
    {

        System.out.println("\r Standard For Loop for comparison ************** ");

        for (int i = 1; i < 6; i++)
        {
            System.out.println("i is equal to " + i);
        }

        System.out.println("\r While Loop 1 ************** ");

        int count = 1;
        while (count != 6)

        {
            System.out.println("Count is equal to " + count);
            count++;
        }

        System.out.println("\r While Loop 2 ************** ");

        count = 1;
        while (true)
        {
            if (count == 6)
            {

                break;
            }
            System.out.println("Count is equal to " + count);
            count++;
        }

        System.out.println("\r Do While Loop ************* ");

        // This will run at least once no matter what.
        count = 1;
        do
        {
            System.out.println("Print 'Do While' " + count);
            count++;
        } while (count != 6);
    }
}
