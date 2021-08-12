package com.Bridgelabs;

/**
 * Objective - Simulates Snake & Ladder game
 *
 * @author - Aviral N
 * @version - 1.2
 * date     - 12-08-2021
 */
public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");

        //variable player1 defines position for PLAYER-1, initially at zero position
        int player1 = 0;

        UtilityClass dice = new UtilityClass();
        player1 += dice.rollDice();            //Calling diceRoll method
        System.out.println("Position " + player1);
    }
}