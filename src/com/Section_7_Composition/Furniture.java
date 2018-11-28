package com.Section_7_Composition;

public class Furniture
{

    private String sofaType;
    private String bedType;
    private int table;
    private int chair;
    private int tv;

    public Furniture(String sofaType,String bedType,int table,int chair,int tv)
    {
        this.sofaType = sofaType;
        this.bedType = bedType;
        this.table = table;
        this.chair = chair;
        this.tv = tv;
    }

    public String getSofaType()
    {
        System.out.println("Your room comes with a " + sofaType + ".");
        return sofaType;

    }

    public String getBedType()
    {
        System.out.println("The bed is a " + bedType + ".");
        return bedType;
    }

    public int getTable()
    {
        System.out.println("There is " + table + " table.");
        return table;
    }

    public int getChair()
    {
        System.out.println("There are " + chair + " chairs.");
        return chair;
    }

    public int getTV()
    {
        System.out.println("There room includes " + tv + " tv.");
        return tv;
    }
}
