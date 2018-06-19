package com.Section_9;

import java.util.Scanner;

public class MinimumElementChallenge
{

    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {

        int[] returnedNumbers = readIntegers(5);
        findMin(returnedNumbers);
    }

    // A method with a parameter called count that represents how many integers the user needs to enter.
    // It reads from the console until all the numbers are entered, and then returns an array
    // containing the numbers entered.

    private static int[] readIntegers(int count)
    {
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " values into the console.");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
        return numbers;
    }

    // a method with an array as a parameter.
    // It returns the minimum value in an array.
    private static int findMin(int[] numbers)
    {
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

        }
        System.out.println("The lowest number entered is: " + minValue);
        return minValue;
    }
}
