package com.Section_8_Encapsulation;


public class Printer {

    private int toner;
    private int numberOfCopies;
    private boolean twoSided;

    public Printer(int toner, int numOfCopies, boolean twoSided) {
        this.toner = toner;
        this.numberOfCopies = numOfCopies;
        this.twoSided = twoSided;
    }

    public void fillToner(int moreToner) {
        if (this.toner >= 100) {
            System.out.println("Toner not required.");
        } else if (this.toner >= 0 && this.toner <= 100) {
            this.toner += moreToner;
            System.out.println("Toner has been added and is at " + this.toner + "% capasity.");
        }
        System.out.println("The toner level is " + this.toner + "% full.");
    }

    public void copiesPrinted(int copies) {
        this.numberOfCopies += copies;
        System.out.println("You have printed " + this.numberOfCopies + " copies.");
    }

    public boolean duplexRequested(boolean twoSided) {
        if (twoSided == false) {
            System.out.println("You've requested copies to be printed on one side only.");
        }
        return true;
    }

    public int getToner() {
        if (this.toner >= 0 && this.toner <= 50) {
            System.out.println("You are low on toner.");
        } else if (this.toner >= 100) {
            System.out.println("Your toner levels are full.");
        } else if (this.toner > 50 && this.toner < 100) {
        }
        System.out.println("Your toner level is at " + this.toner + "%.");
        return this.toner;

    }

    public int getNumberOfCopies() {
        System.out.println("You have printed " + this.numberOfCopies + " copies.");
        return numberOfCopies;
    }

    public boolean isTwoSided() {
        if (true) {
            System.out.println("You've chosen to print on both sides.");
        }
        return false;
    }
}
