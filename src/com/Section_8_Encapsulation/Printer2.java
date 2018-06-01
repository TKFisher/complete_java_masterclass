package com.Section_8_Encapsulation;

public class Printer2 {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean doubleSided;

    public Printer2(int tonerLevel, boolean doubleSided) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 1;
        }
        this.doubleSided = doubleSided;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                // returns an invalid number to indicate the test did not pass.
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.doubleSided){
            System.out.println("Double sided is enabled.");
            pagesToPrint /= 2;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
