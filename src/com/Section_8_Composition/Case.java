package com.Section_8_Composition;

public class Case {
    private String model;
    private String manufactor;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufactor, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufactor = manufactor;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton (){
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufactor() {
        return manufactor;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
