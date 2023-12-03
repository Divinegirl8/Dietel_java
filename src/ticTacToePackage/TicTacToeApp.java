package ticTacToePackage;

import java.util.Scanner;

public class TicTacToeApp {

static Player gamePlayer = new Player();

    public static void displayGame(String player1, String player2) {
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("your turn player " + (gamePlayer.getPlayer() ? player2 : player1));

            try {
                gamePlayer.play(new Scanner(System.in).nextLine());
                gamePlayer.printBoard();

                if (gamePlayer.checkWinner(gamePlayer.getPlayer())) {
                    System.out.println("Player " + (gamePlayer.getPlayer() ? player1 : player2) + " wins!");
                    gameEnded = true;
                } else if (gamePlayer.isBoardFull()) {
                    System.out.println("It's a draw!");
                    gameEnded = true;
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                gamePlayer.switchPlayer();
            }
        }
    }



    public static void main(String[] args) {

        System.out.println("Enter your name player1: ");
        String player1 = new Scanner(System.in).nextLine();
                System.out.println("Welcome "+ player1 +" You are " + CellValues.X);

        System.out.println("Enter your name player2: ");
        String player2 = new Scanner(System.in).nextLine();

        System.out.println("Welcome "+player2 +" You are " + CellValues.O + "\n");
        System.out.println("please players choose a number between 1 - 9" + "\n");
        displayGame(player1,player2);


    }



}
