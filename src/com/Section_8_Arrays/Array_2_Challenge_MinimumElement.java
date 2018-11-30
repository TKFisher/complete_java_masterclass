package com.Section_8_Arrays;

/*      -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
         The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.

        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.

        -Finally, print the minimum element in the array.

        Tips:
        -Assume that the user will only enter numbers, never letters
	    -For simplicity, create a Scanner as a static field to help with data input
	    -Create a new console project with the name 'MinElementChallenge' */

import java.util.Scanner;

public class Array_2_Challenge_MinimumElement
{
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
/*        int[] returnedNumbers = readIntegers(5);
        findMin(returnedNumbers);*/

        int [] returnNumbers2 = readIntegers2(5);
        findMin(returnNumbers2);
    }

    // A method with a parameter called count that represents how many integers the user needs to enter.
    // It reads from the console until all the numbers are entered, and then returns an array containing the numbers entered.
    private static int[] readIntegers(int  count)
    {
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " values into the console.");

        for (int i = 0; i < numbers.length; i++)
        {
            // ERROR on this line = Java.lang.NumberFormatException: For input string: ...
            numbers[i] = Integer.valueOf(scan.nextLine());
        }
        return numbers;
    }

    private static int[] readIntegers2(int count)
    {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            scan.nextLine();
            array[i] = number;
        }
        return array;
    }

    // A method with an array as a parameter. It returns the minimum value in an array.
    private static int findMin(int[] numbers)
    {
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < minValue)
            {
                minValue = numbers[i];
            }
        }
        System.out.println("The lowest number entered is: " + minValue);
        return minValue;
    }

    private static int findMin2(int[] array)
    {
        // Setting min to Max value because if set to Min value (which is equal to 0). If the user entered all positive values
        // then min would return zero even if the user did not enter zero.  Try setting to Integer.MIN_VALUE.
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; )
        {
            int value = array[i];
            if (value < min)
            {
                min = value;
            }
        }
        return min;
    }
}
