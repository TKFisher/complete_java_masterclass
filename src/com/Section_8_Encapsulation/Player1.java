package com.Section_8_Encapsulation;

public class Player1 {

    public String name;
    public int health = 100;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player is knocked out.");
        }}

    public int healthRemaining() {
        return this.health;
    }

}
