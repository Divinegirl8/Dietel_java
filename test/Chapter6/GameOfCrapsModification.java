package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfCrapsModification {
    private enum GameStatus{Continue,Won,Lost};
    private static final int Snake_Eye = 2;
    private static final int Trey = 3;

    private static final int Seven = 7;
    private static final int Yo_Leven = 11;
    private static final int Box_Cars = 12;

    private static int bankBalance = 1_000;

    public static int rollDice(){
        SecureRandom random = new SecureRandom();

        int firstDie = 1 + random.nextInt(6);
        int secondDie = 1 + random.nextInt(6);

        return firstDie + secondDie;

    }

    private static void playGame(int wager) {
        int point;
        int sumDices = rollDice();
        GameStatus status;




        switch (sumDices) {
            case Seven, Yo_Leven -> status = GameStatus.Won;
            case Snake_Eye, Trey, Box_Cars -> status = GameStatus.Lost;
            default -> {
                {
                    point = rollDice();
                    status = GameStatus.Continue;
                    System.out.println("point is " + point);
                }


                while (status == GameStatus.Continue) {
                    sumDices = rollDice();

                    if (sumDices == point) status = GameStatus.Won;
                    else if (sumDices == Seven) status = GameStatus.Lost;
                }

            }
        }

        if (status == GameStatus.Won) {System.out.println("player wins");
        bankBalance += wager;
            System.out.println("new balance is " + bankBalance);
        }
        else  {
            System.out.println("player loses");
            bankBalance -= wager;
            System.out.println("new balance is " + bankBalance);
        }

        displayChatterMessages(bankBalance);

    }

    private static void displayChatterMessages(int bankBalance) {
        if (bankBalance > 500) {
            System.out.println("Oh, you're going for broke, huh?");
        } else if (bankBalance > 100) {
            System.out.println("Aw c'mon, take a chance!");
        } else {
            System.out.println("You're up big. Now's the time!");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (bankBalance > 0) {
            System.out.println("Enter a wager");
            int wager = scanner.nextInt();

            while (wager > bankBalance) {
                System.out.println("Enter a valid wager");
                wager = scanner.nextInt();
            }

            playGame(wager);
        }

        System.out.println("Game over! You are busted.");
    }
}
