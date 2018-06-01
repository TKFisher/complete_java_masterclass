package com.Section_8_Composition;

public class Room {

    private Furniture myFurniture;
    private Utilities myUtilities;

    public Room(Furniture myFurniture) {
        this.myFurniture = myFurniture;
        this.myUtilities = myUtilities;
    }

    public Furniture getMyFurniture() {
        return myFurniture;
    }

    public Utilities getMyUtilities() {
        return myUtilities;
    }
}
