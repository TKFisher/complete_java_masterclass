package com.Section_8_Arrays;

import java.util.Arrays;

public class Array_2_ValueTypes_and_ReferenceTypes
{

    public static void main(String[] args)
    {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);


        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        int populateWith = 1;
        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = populateWith;
            populateWith += 1;
        }

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 9;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
}

    private static void modifyArray(int[] array)
    {
        array[0] = 0;
        System.out.println("Method print out for passed in value for updated index value to " + Arrays.toString(array));
        array = new int[]{6,7,8,9,0};
        System.out.println("Method print out for new array within method with the following values:  " + Arrays.toString(array));
    }
}
