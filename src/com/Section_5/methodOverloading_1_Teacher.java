package com.Section_5;

public class methodOverloading_1_Teacher {

    public static void main(String[] args) {

       double cent = calcFeetAndInchesToCentimeters(calcFeetAndInchesToCentimeters(6, 0));
        if(cent < 0.0){
            System.out.println("An invalid parameter was used.");
        }

        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet <0) || ((inches < 0) || (inches >12))){
            System.out.println("Invalid feet or inches.");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0)
            return -1;

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player2 " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // This is a copy of the above method using the same name. To use a method with the same name you
    // need to change the number of parameters being passed or you will get an error.  This is called
    // overloading a method.
    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + score + " points.");
        return score * 1000;
    }

    // another overloaded method with no parameters.
    public static int calculateScore() {
        System.out.println("An unnamed player without a score.");
        return 0;
    }

    // Note:  you cannot have a method in this case that returns a void....

}
