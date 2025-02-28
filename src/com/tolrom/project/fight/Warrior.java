package com.tolrom.project.fight;

public class Warrior extends Character{

    // Attributes
    private int bonusDefence;

    // Constructor
    public Warrior(String name, int hp, int attack, int defence, int bonusDefence) {
        super(name, hp, attack, defence);
        this.bonusDefence = bonusDefence;
    }

    // Getters & Setters
    public int getBonusDefence() {
        return bonusDefence;
    }

    public void setBonusDefence(int bonusDefence) {
        this.bonusDefence = bonusDefence;
    }

    // Methods
    @Override
    public int attack(Character target){
        if(Math.floor(Math.random()*21) == 20) {
            return super.attack(target)+ this.getBonusDefence();
        }
        return super.attack(target);
    }
}
