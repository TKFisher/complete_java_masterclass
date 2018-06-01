package com.Section_8_Composition;

public class Utilities {

    private boolean cable;
    private int phoneHookup;
    private int internet;
    private Cable myCable;

    public Utilities(boolean cable, int phoneHookup, int internet, Cable myCable) {
        this.cable = cable;
        this.phoneHookup = phoneHookup;
        this.internet = internet;
    }

    public boolean isCable() {
        return cable;
    }

    public int getPhoneHookup() {
        return phoneHookup;
    }

    public int getInternet() {
        return internet;
    }

    public Cable getMyCable() {
        return myCable;
    }
}
