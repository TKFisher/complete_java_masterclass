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


    public static class arrayMethod
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
}



