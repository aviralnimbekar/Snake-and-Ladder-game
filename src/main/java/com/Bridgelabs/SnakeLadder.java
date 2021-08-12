package com.Bridgelabs;

/**
 * Objective - Simulates Snake & Ladder game
 *
 * @author - Aviral N
 * @version - 1.7
 * date     - 12-08-2021
 */
public class SnakeLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");

        //variable player1 and player2 defines position for PLAYER-1 and PLAYER-2, initially at zero position
        int player1 = 0;
        int player2 = 0;
        UtilityClass dice = new UtilityClass();            //Object of utility class

        //initiating counter to count total number of round played
        int totalRound = 0;

        //using a while loop to repeat entire steps till winning point
        while (player1 <= 100 || player2 <= 100) {

            totalRound++;
            System.out.println("Round-----" + totalRound);

            //PLAYER-1's TURN
            System.out.println("PLAYER-1's TURN");

            //Rolling dice
            player1 += dice.rollDice();                        //Calling diceRoll method
            System.out.println("Intermediate Position for P1 " + player1);

            //Checking for condition - Snake Ladder or Noplay
            player1 = dice.option(player1);                    //Calling option method for Snake Ladder or NoPlay
            System.out.println("final Position for P1 " + player1);
            if (player1 == 100) {
                System.out.println("---PLAYER-1 WON---");
                break;
            }

            //PLAYER-2's TURN
            System.out.println("PLAYER-2's TURN");

            //Rolling dice
            player2 += dice.rollDice();                        //Calling diceRoll method
            System.out.println("Intermediate Position for P2 " + player2);

            //Checking for condition - Snake Ladder or Noplay
            player2 = dice.option(player2);                    //Calling option method for Snake Ladder or NoPlay
            System.out.println("final Position for P2 " + player2);
            if (player2 == 100) {
                System.out.println("---PLAYER-2 WON---");
                break;
            }
        }
        System.out.println("Total Round played " + totalRound);
    }
}