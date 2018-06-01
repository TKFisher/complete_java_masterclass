package com.Section_9;


public class Switch_Challenge {

    public static void main(String[] args) {


        // Example using a primitive Char variable.
        char myChar = 'G';
        switch (myChar) {

            case 'A': {
                System.out.println("Character = A.");
                break;
            }
            case 'B': {
                System.out.println("Character =  B.");
                break;
            }
            case 'C': {
                System.out.println("Character = C.");
                break;
            }
            case 'D':
            case 'E': {
                System.out.println("Character = D or E.");
                break;
            }
            default:
                System.out.println("Character is not A, B, C, D, or E.");
                break;


        }

        // Example using a String.
        String myMonth = "FeBRuary";

        // Notice we added the "toLowerCase" method from String, and forces matches on lower case.
        // All case statements need to be in lower case.
        switch (myMonth.toLowerCase()) {
            case "january": {
                System.out.println("Month is January.");
                break;
            }

            case "february": {
                System.out.println("Month is Feb.");
                break;
            }
            default:
                System.out.println("Not sure....This is case sensitive.");


        }


    }
}
