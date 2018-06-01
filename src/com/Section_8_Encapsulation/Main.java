package com.Section_8_Encapsulation;


public class Main {

    public static void main(String[] args) {

        System.out.println("********** Part 1 - Demo ");

        // Non Encapsulated:
        Player1 player1 = new Player1();
        player1.name = "Tim";
        player1.health = 20;
        player1.weapon = "sword";
        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health is " + player1.health);
        damage = 11;   // this will by pass
        player1.loseHealth(damage);
        System.out.println("Remaining health is " + player1.health);

        System.out.println("********** ");

        // Encapsulated version
        Player2 player2 = new Player2("Rockie", 50, "sword");
        // Accessing the health score by calling the getHealth() method instead of the public variable like
        // in the above Player1 class.
        System.out.println("Status of health of player is = " + player2.getHealth());

        System.out.println("********** Part 2 - Challenge \n ");

        // Create a class called Printer and demonstrate proper encapsulation techniques.
        // It will simulate a real computer printer. It should have fields for toner level, number
        // of pages printed, and a setting to indicate 'two-sided'.  Print a message if set to 'two-sided'.
        // Add methods to fill up the toner (up to a max of 100%), and another method simulate printing
        // a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer print1 = new Printer(10, 10, true);

        print1.getNumberOfCopies();
        print1.isTwoSided();
        print1.getToner();
        print1.fillToner(10);

        System.out.println("********** Part 2 - Another way to do the challenge  \n ");

        Printer2 printer2 = new Printer2(50, true);
        System.out.println("Initial page count = " + printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " and new total = " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(6);
        System.out.println("Pages printed was " + pagesPrinted + " and new total = " + printer2.getPagesPrinted());
    }
}
