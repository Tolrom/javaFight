package com.tolrom.project;

import com.tolrom.project.fight.Game;
import com.tolrom.project.fight.Rogue;
import com.tolrom.project.fight.Warrior;

public class Main {
    public static void main(String[] args) {
        Rogue player1 = new Rogue(
                "Rengar",
                20,
                6,
                3,
                3
        );
        Warrior player2 = new Warrior(
                "Darius",
                30,
                4,
                5,
                2
        );
        Game fight = new Game(
                player1,
                player2,
                25
        );
        System.out.println(fight.startGame());
    }
}
