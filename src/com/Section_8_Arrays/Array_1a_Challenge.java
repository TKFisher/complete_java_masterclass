package com.Section_8_Arrays;

import java.util.Scanner;

public class Array_1a_Challenge
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    // returns and array of integers from the keyboard.
    public static int[] getIntegers(int number)
    {

        System.out.println("Enter " + number + " values \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++)
        {
            // Scans the next token of the input as an int
            values[i] = scanner.nextInt();
        }

        return values;
    }

    // prints out the contents of the array
    public static void printArray(int[] array)
    {

        for (int i = 0; i < array.length; i++)
            System.out.println("Element " + i + ", value is " + array[i]);
    }

    // sort the array and return a new array containing the sorted numbers
    public static int[] sortIntegers(int[] array)
    {

        // Copying one array into another by first creating a new array that will be exactly the same length as the array we will be passing it.
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            // creates a copy of the contents of the array that is passed to us via the method argument "array",
            // and stores them in our new array, "sortedArray".
            sortedArray[i] = array[i];
        }

        //OR:  instead of above manually created method you can use a built in array copy method.  This next line does the same thing as above.
        //int[] sortedArray = Arrays.copyOf(array, array.length);

        // the code that sorts the array:
        boolean flag = true;
        int temp;
        while (flag)
        {
            flag = false;

            // element 0 = 50
            // element 1 = 160
            // element 2 = 40

            for (int i = 0; i < sortedArray.length - 1; i++)
            {
                if (sortedArray[i] < sortedArray[i + 1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}