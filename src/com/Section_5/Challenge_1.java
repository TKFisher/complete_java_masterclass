package com.Section_5;

public class Challenge_1 {


    public static void main(String[] args) {

        // test out the following:  1500. 900, 400, and 50
        int playerScore = 500;

        displayHighScorePosition("Brenda", 1);

        int highScorePosition = calculateHighScorePosition(playerScore);
        System.out.println("Player2 returned a high score position of " + highScorePosition);
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + "on the team.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        }
        if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else
            return 4;
    }

}
