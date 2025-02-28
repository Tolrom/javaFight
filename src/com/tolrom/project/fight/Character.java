package com.tolrom.project.fight;

public class Character {

    // Attributes
    private String name;
    private int hp;
    private int attack;
    private int defence;

    // Constructors
    public Character(){};
    public Character(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    // Methods
    public int attack(Character target){
        int dmg = this.getAttack() - target.getDefence();
        target.setHp(target.getHp()-dmg);
        return dmg;
    }
}
