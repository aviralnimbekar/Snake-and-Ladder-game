package com.Bridgelabs;

/**
 * Objective - Simulates Snake & Ladder game
 *
 * @author - Aviral N
 * @version - 1.3
 * date     - 12-08-2021
 */
public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");

        //variable player1 defines position for PLAYER-1, initially at zero position
        int player1 = 0;
        UtilityClass dice = new UtilityClass();            //Object of utility class

        //Rolling dice
        player1 += dice.rollDice();                        //Calling diceRoll method
        System.out.println("Position " + player1);

        //Checking for condition - Snake Ladder or Noplay
        player1 = dice.option(player1);                    //Calling option method for Snake Ladder or NoPlay
        System.out.println("final Position " + player1);
    }
}