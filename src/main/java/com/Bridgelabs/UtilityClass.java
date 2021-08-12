package com.Bridgelabs;

public class UtilityClass {

    static int dice;

    /**
     * Rolling dice to get number between number 1 to 6
     *
     * @return -  dice(1-6)
     */
    public int rollDice() {

        dice = (int) ((Math.random() * 6) + 1);
        System.out.println("Dice " + dice);
        return dice;
    }

    /**
     * checking condition for snake, ladder or no play
     *
     * @param player Player1
     * @return player (final position of player for particular round)
     */
    public int option(int player) {

        int LADDER = 1, SNAKE = 2;      // NOPLAY = 0
        int condition = (int) (Math.random() * 3);

        if (condition == LADDER) {
            System.out.println("<LADDER>");
            player += dice;                    //adding dice value for one more time in to current position

            //upper limit
            if (player > 100) {
                player -= (2 * dice);
            }
        } else if (condition == SNAKE) {
            System.out.println("<SNAKE>");
            player -= dice;                    //subtracting dice value from current position

            //lower limit
            if (player < 0) {
                player = 0;
            }
        } else {
            System.out.println("<NOPLAY>");    //in case of no play player remains in current position

            //upper limit
            if (player > 100) {
                player -= dice;
            }
        }
        return player;
    }
}
