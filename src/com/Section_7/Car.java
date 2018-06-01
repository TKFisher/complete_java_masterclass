package com.Section_7;


public class Car {

    // Fields:
    // By making these variables "private" we are following the rule of encapulation, where by
    // we keep access to all of the variable restricted within the class.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Get Method
    public String getModel() {
        return this.model;
    }

    //  Set Method - notice that when you type "set" IntelliJ auto-adds the above variables to it.
    public void setModel(String model) {
        // to allow us to update the field variable "model" with the contents of
        // the parameter "model" being passed to the method:
        this.model = model;
    }

    // Updating the above to include validation rules.  It's always good to define all the rules/validations within
    // the class itself.
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if (validModel.equals("carrera") || validModel.equals("holden")) {
//            this.model = model;
//        } else {
//            this.model = "an unknown model";
//        }
//    }
}




