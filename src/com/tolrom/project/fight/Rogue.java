package com.tolrom.project.fight;

public class Rogue extends Character{

    // Attributes
    private int bonusAttack;

    // Constructor
    public Rogue(String name, int hp, int attack, int defence, int bonusAttack) {
        super(name, hp, attack, defence);
        this.bonusAttack = bonusAttack;
    }

    // Getters & Setters

    public int getBonusAttack() {
        return bonusAttack;
    }

    public void setBonusAttack(int bonusAttack) {
        this.bonusAttack = bonusAttack;
    }

    // Methods
    @Override
    public int attack(Character target){
        if(Math.floor(Math.random()*21) == 20) {
            return super.attack(target)+ this.getBonusAttack();
        }
        return super.attack(target);
    }
}
