package com.Section_4_PrimitiveDataType;


public class ByteShortLong {


    public static void main(String[] args){

        byte myByteVar = -10;
        short myShortVar = 34;
        int myIntVar = 200_500;

        long myLongVar = (5000 + 10) * (myByteVar + myShortVar + myIntVar);

        System.out.println(myLongVar);

        // example of casting
        short shortTotal = (short)(1000 + 10 * (myByteVar + myShortVar + myIntVar));

        System.out.println(shortTotal);
    }





}
