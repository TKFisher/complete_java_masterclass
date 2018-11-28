package com.Section_7_Polymophism;

public class IndependenceDay extends Movie
{

    public IndependenceDay()
    {
        super("Indepence Day");
    }


    @Override
    public String plot()
    {
        return "Aliens attempt to take over earth.";
    }
}
