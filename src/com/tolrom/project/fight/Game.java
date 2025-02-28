package com.tolrom.project.fight;

public class Game {

    // Attributes
    private Character player1;
    private Character player2;
    private int turns;

    // Constructor
    public Game() {}
    public Game(Character player1, Character player2, int turns) {
        this.player1 = player1;
        this.player2 = player2;
        this.turns = turns;
    }

    // Getters & Setters

    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }

    public Character getPlayer2() {
        return player2;
    }

    public void setPlayer2(Character player2) {
        this.player2 = player2;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    // Methods
    public String startGame(){
        while(this.getTurns() > 0){
            System.out.println(this.getPlayer1().getName() + " attacked " + this.getPlayer2().getName() + " and inflicted " + this.getPlayer1().attack(this.getPlayer2()) + " damage.");
            System.out.println(this.getPlayer2().getName() + " attacked " + this.getPlayer1().getName() + " and inflicted " + this.getPlayer2().attack(this.getPlayer1()) + " damage.");
            this.setTurns(this.getTurns()-1);
            if (this.getPlayer1().getHp() < 0){
                if(this.getPlayer2().getHp() < 0){
                    return "Both died, the game drew.";
                }
                else{
                    return this.getPlayer2().getName() + " obliterated " + this.getPlayer1().getName();
                }
            }
            else if(this.getPlayer2().getHp() < 0){
                return this.getPlayer1().getName() + " obliterated " + this.getPlayer2().getName();
            }
        }
        return "Nobody died before the end of the fight, the game drew.";
    }
}
