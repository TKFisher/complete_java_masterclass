package com.Section_7_Polymophism;

public class Jaws extends Movie
{

    public Jaws()
    {
        super("Jaws");

    }

    @Override
    public String plot()
    {
        return "Jaws eats a lot of people. ";
    }
}
