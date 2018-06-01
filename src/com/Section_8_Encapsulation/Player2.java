package com.Section_8_Encapsulation;

/*
*  Encapsulation includes making your fields 'private' so that they are not accessible outside of the class.
*  By making the fields private I can later change refactor the names of the fields and
*  it will not have an impact on the class when called from the Main method.
* */


public class Player2 {

    // Setting to 'private' encapsulates the variables thereby
    // protecting them from manipulation outside of this class.
    private String name;
    private int health = 100;
    private String weapon;

    // Creating a constructor with these args grantees they are initialized when
    // the class is instantiated.

    public Player2(String name, int health, String weapon) {
        this.name = name;

        // Basic validation is added here to ensure that the value of health
        // cannot be set outside of this range.
        if (health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player2 is knocked out.");
        }
    }

    public int getHealth() {
        return health;
    }
}
