package com.workintech.model;

import java.util.StringTokenizer;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void healthCheck(int healthPercentage){
        if(healthPercentage > 100){
            this.healthPercentage = 100;
        }else if (healthPercentage<0){
            this.healthPercentage = 0;
        }else {
            this.healthPercentage= healthPercentage;
        }

    }
    public Player(String name, int healthPercentage){
        this.name= name;
        healthCheck(healthPercentage);
    }

    public Player(String name, int healthPercentage, Weapon weapon){
        this(name, healthPercentage);
        this.weapon= weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        int healthRemain= healthPercentage- damage;
        if(healthRemain<= 0){
            System.out.println(name + " player has been knocked out of game");
        }
        healthCheck(healthRemain);
    }
    public void restoreHealth(int healthPotion){
        healthCheck(healthPercentage + healthPotion);
    }

    public String toString(){
        return "Name: " + name + "HealthPercentage: " + healthPercentage + "Weapon: " + (weapon.getDamage() + weapon.getAttackSpeed());
    }
}
