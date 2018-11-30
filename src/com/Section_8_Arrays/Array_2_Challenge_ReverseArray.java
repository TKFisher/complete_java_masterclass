package com.Section_8_Arrays;

/*

-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name 'ReverseArrayChallenge'*/

import java.util.Arrays;
import java.util.Collections;


public class Array_2_Challenge_ReverseArray
{

    public static void main(String[] args)
    {
       /* //My solution:
        Integer[] myArray = {3,5,1,8,2,99};
        System.out.println(Arrays.toString(myArray));

        reverseOrder(myArray);
        System.out.println(Arrays.toString(myArray));*/


        // Teacher's solution:
        int [] array = {6, 2, 11, 99, 0, 101};
        System.out.println("Original array: " + Arrays.toString(array));

        reverseOrder2(array);
        System.out.println("Round 1: " + Arrays.toString(array));

        reverseOrder2(array);
        System.out.println("Round 2: " + Arrays.toString(array));
    }

    //My solution:
    private static void reverseOrder(Integer[] array)
    {
        Collections.reverse(Arrays.asList(array));
    }

    // Teacher's solution:
    private static void reverseOrder2(int[] array ){

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i ++ ){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] =  temp;
        }

    }


}
