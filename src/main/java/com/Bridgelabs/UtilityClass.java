package com.Bridgelabs;

public class UtilityClass {

    /**
     * Rolling dice to get number between number 1 to 6
     *
     * @return -  dice(1-6)
     */
    public int rollDice() {

        int dice = (int) ((Math.random() * 6) + 1);
        System.out.println("Dice " + dice);
        return dice;
    }
}