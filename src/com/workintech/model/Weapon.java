package com.workintech.model;

public enum Weapon {
    SWORD(10, 1.6),
    AXE(12, 1.2),
    MACE(32, 1.3);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage= damage;
        this.attackSpeed= attackSpeed;
    }
    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
