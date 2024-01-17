package chapter7;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static int[] diceValueOutcome(){
        int[] board = new int[6];

        Random random = new Random();



        for (int index = 0; index < 6; index++) {
            int firstDie = random.nextInt(1,7);
            int secondDie = random.nextInt(1,7);
            int total = firstDie + secondDie;
            board[index] = total;
        }


     return board;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diceValueOutcome()));
    }
}
