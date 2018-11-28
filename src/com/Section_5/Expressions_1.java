package com.Section_5;


public class Expressions_1
{


    public static void main(String[] main)
    {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //        if (score < 5000 && score > 1000){
        //            System.out.println("Your score is between 1000-5000.");
        //        }else if (score < 1000) {
        //            System.out.println("less than 1000");
        //        } else {
        //            System.out.println("greater than 5000.");
        //        }

        if (gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was from first game: " + finalScore);
        }

        gameOver = true;
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was from second game: " + finalScore);
        }
    }

}
