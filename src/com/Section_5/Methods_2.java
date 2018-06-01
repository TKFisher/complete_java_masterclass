package com.Section_5;


public class Methods_2 {

    public static void main(String[] main) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
  }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Final score first game: " + finalScore);
        }
    }
}
