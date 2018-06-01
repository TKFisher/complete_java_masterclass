package com.Section_8_Polymophism;

public class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Indepence Day");
    }


    @Override
    public String plot() {
        return "Aliens attempt to take over earth.";
    }
}
