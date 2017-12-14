package com.iquestgroup.remotelearning.week2.rpg;

public class Game {
    public static void main(String args[]) {
        Actor robin = new Hero(50, 10, 200, "Robin");
        Actor wolf1 = new Wolf(30, 3, 50);
        Actor wolf2 = new Wolf(30, 3, 50);
        Actor wolf3 = new Wolf(30, 3, 50);
        Actor superhedgehog = new SuperHedgehog(50, 15, 300);
        wolf1.specialAttack(robin);
        wolf2.specialAttack(robin);
        robin.basicAttack(wolf1);
        robin.specialAttack(wolf1);
        robin.specialAttack(wolf2);
        wolf3.basicAttack(robin);
        robin.specialAttack(wolf3);
        robin.specialAttack(superhedgehog);
        superhedgehog.specialAttack(robin);
    }
}
