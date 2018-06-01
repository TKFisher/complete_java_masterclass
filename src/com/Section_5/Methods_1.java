package com.Section_5;


public class Methods_1 {

    public static void main(String[] main) {

//        No longer need the variables as they are defined in method.
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, bonus);
        calculateScore(true, 10000, 8, 200);

        // Don't need the variable or 'if' statement now.
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Final score second game: " + finalScore);
//        }

  }

    // new method to calcule the score and display results.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
/*
        // I don't need these anymore as we have defined them as parameters in the method.
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
*/

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Final score first game: " + finalScore);
        }

    }
}
