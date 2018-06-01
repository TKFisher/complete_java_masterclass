package com.Section_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_52_2_Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    // returns and array of integers from the keyboard.
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " values \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            // Scans the next token of the input as an int
            values[i] = scanner.nextInt();
        }

        return values;
    }

    // prints out the contents of the array
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++)
            //System.out.println(i);

            System.out.println("Element " + i + ", value is " + array[i]);
    }

    // sort the array and return a new array containing the sorted numbers
    public static int[] sortIntegers(int[] array) {
        // creating a new array that will be exactly the same length as the array we will be passing it.

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // creates a copy of the contents of the array that is passed to us via the method argument "array",
            // and stores them in our new array, "sortedArray".
            sortedArray[i] = array[i];
        }

        //OR:  instead of above manually created method you can use a built in array copy method.  This next
        // line does the same thing as above.
        //int[] sortedArray = Arrays.copyOf(array, array.length);

        // the code that sorts the array:
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            // element 0 = 50
            // element 1 = 160
            // element 2 = 40
            // 3 , 0, 1, 9, 2

            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}