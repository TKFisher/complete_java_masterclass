package com.Section_8_Polymophism;


public class Main {

    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {
            Movie movie = Movie.randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }


    }


}
