package com.Section_9;


import java.util.Scanner;

public class Array_52_1 {

    public static void main(String[] args) {

        int[] myIntArray = new int[25]; //{ 1,2,3,4,5,6,7,8,9,10}
        //myIntArray[0] = 45;
        //myIntArray[1] = 476;
        // myIntArray[5] = 23;

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;


        }

/*        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }*/

        // OR: Instead of the above, you can create a method and pass it here:
         printArray(myIntArray);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static class Array_54_1 {

        private static Scanner scan = new Scanner(System.in);
        // the "int" is a primitive type.
        private static int[] baseData = new int[3];

        public static void main(String[] args) {
            System.out.println("Enter 3 numbers:");
            getInput();
            printArray(baseData);
            resizeArray();
            //System.out.println("Enter 5 integers: ");
            //getInput();
            baseData[3] = 88;
            baseData [4] = 99;
            printArray(baseData);
        }

        private static void getInput() {
            for (int i = 0; i < baseData.length; i++) {
                // Scans the next token of the input as an int.
                baseData[i] = scan.nextInt();
            }
        }

        private static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                //System.out.println();
            }
        }

        private static void resizeArray() {

            // making a copy of "basedata" variable and store it in another array variable,
            // in this case called "original".
            int[] original = baseData;

            // a new array with new size, goes thru a loop to get each element from the copy,
            // "original" array, and stores it in back in the new array, "baseData".
            baseData = new int[5];
            for (int i=0; i<original.length; i++){
                baseData[i] = original[i];
            }
        }


    }
}



