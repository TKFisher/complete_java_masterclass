package com.Section_8_Arrays;


import java.util.Scanner;

public class Array_1
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        // Define and initialize an array with value 1-10 for a total of 10 index positions:
        int[] myIntArray1 = {1,2,3,4,5,6,7,8,9,10};

        // Define and array with a total of 25 index positions:
        int[] myIntArray2 = new int[25];

        // You can also initialize by adding values this way for each index position:
        //myIntArray2[0] = 45;
        //myIntArray2[1] = 476;
        //myIntArray2[5] = 23;

        // Or initialize an array with a For Loop followed by another loop to print out the data.
        for (int i = 0; i < myIntArray2.length; i++)
        {
            myIntArray2[i] = i * 10;
        }
        for (int i = 0; i < myIntArray2.length; i++)
        {
            System.out.println("Element " + i + ", value is " + myIntArray2[i]);
        }

        // OR: Instead of the above, you can create a method and pass in the array:
        printArray(myIntArray1);

    }


    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}



