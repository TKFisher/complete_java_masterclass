package com.Section_5;


public class Methods_3
{

    public static void main(String[] main)
    {

        // (1)
        // variables outside of the method.
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver,score,levelCompleted,bonus);

        // (2)
        // method with values for each argument.
        // you can assign a variable to a method too like this:
        int finalScore = calculateScore(true,10000,8,200);
        System.out.println("Final score for second came is " + finalScore);
    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus)
    {

        if (gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Final score: " + finalScore);
            return finalScore;
        } else
        {
        }
        return -1;

    }
}
