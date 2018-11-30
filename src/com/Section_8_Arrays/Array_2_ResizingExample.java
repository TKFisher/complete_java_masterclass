package com.Section_8_Arrays;

import java.util.Scanner;

public class Array_2_ResizingExample
{

    private static Scanner scan = new Scanner(System.in);

    // the "int" is a primitive type.
    private static int[] baseData = new int[3];

    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers:");
        getInput();
        printArray(baseData);
        resizeArray();

        //System.out.println("Enter 5 integers: ");
        //getInput();
        // Manual input of values:
        baseData[3] = 88;
        baseData[4] = 99;

        printArray(baseData);
    }

    private static void getInput()
    {
        for (int i = 0; i < baseData.length; i++)
        {
            // Scans the next token of the input as an int.
            baseData[i] = scan.nextInt();
        }
    }

    private static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
            //System.out.println();
        }
    }

    private static void resizeArray()
    {

        // making a copy of "basedata" variable and store it in another array variable,
        // in this case called "original".
        int[] original = baseData;

        // a new array with new size, goes thru a loop to get each element from the copy,
        // "original" array, and stores it in back in the new array, "baseData".
        baseData = new int[5];
        for (int i = 0; i < original.length; i++)
        {
            baseData[i] = original[i];
        }
    }


}
