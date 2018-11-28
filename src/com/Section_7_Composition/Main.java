package com.Section_7_Composition;


public class Main
{

    public static void main(String[] args)
    {


        System.out.println("************* Part 1:");

        // Example of initializing the Dimensions() class first before passing the arguments to the variable in the Case() class.
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2200","Dell","240",dimensions);

        // Another way is to initialize the class as an argument.
        Monitor theMonitor = new Monitor("27 inch beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        //        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        //        thePC.getMotherboard().loadProgram("Windows 1.0");
        //        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        System.out.println("************* Part 2:  \n");

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well.
        // Add at least one method to access an object via a getter and
        // then that objects public method.
        // Add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main clause.


        Room myRoom = new Room(new Furniture("love seat","single bed",1,2,1));
        myRoom.getMyFurniture().getSofaType();
        myRoom.getMyFurniture().getBedType();
        myRoom.getMyFurniture().getTable();
        myRoom.getMyFurniture().getChair();
        myRoom.getMyFurniture().getTable();
        Cable myCustomCable = new Cable();
        myCustomCable.customCablePackage("Century Link","with Hulu",2);
    }
}
