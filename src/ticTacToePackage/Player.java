package ticTacToePackage;

import ticTacToePackage.exceptionPackage.InvalidInputException;
import ticTacToePackage.exceptionPackage.SpaceIsOccupiedError;

import java.util.Scanner;

public class Player {


    private final TicTacToe ticTacToe = new TicTacToe();
    private final CellValues[][] board = ticTacToe.getBoard();
    boolean player;



    public CellValues[][] play(String userNumber) {
        CellValues cellValues = player ? CellValues.O : CellValues.X;
        player = !player;
        
        switch (userNumber){
            case "1" -> {return makeMove(0,0,cellValues);}
            case "2" -> {return makeMove(0,1,cellValues);}
            case "3" -> {return makeMove(0,2,cellValues);}
            case "4" -> {return makeMove(1,0,cellValues);}
            case "5" -> {return makeMove(1,1,cellValues);}
            case "6" -> {return makeMove(1,2,cellValues);}
            case  "7" -> {return makeMove(2,0,cellValues);}
            case "8" -> {return makeMove(2,1,cellValues);}
            case "9" -> {return makeMove(2,2,cellValues);}
           default -> throw new InvalidInputException("Error!!! choose between 1 - 9");
        }


    }

    private CellValues[][] makeMove(int row, int col, CellValues cellValues) {
        if (board[row][col] == CellValues.EMPTY) {
            board[row][col] = cellValues;
        } else {
            spaceIsOccupiedError();
        }
        return board;
    }


    private void spaceIsOccupiedError() {
        throw new SpaceIsOccupiedError("Space has been occupied by your opponent");
    }

    public void printBoard(){
        for (CellValues[] cellValues : board) {
            for (int column = 0; column < cellValues.length; column++) {
                for (int evenPosition = 0; evenPosition < column; evenPosition += 2) System.out.print("|\t\t");
                System.out.printf("%-9s", cellValues[column]);
            }
            System.out.println("\n");
        }
    }

    public boolean checkWinner() {
        CellValues cellValues = player ? CellValues.O : CellValues.X;


        for (int row = 0; row < 3; row++) {
            if (board[row][0] == cellValues && board[row][1] == cellValues && board[row][2] == cellValues) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (board[0][col] == cellValues && board[1][col] == cellValues && board[2][col] == cellValues) {
                return true;
            }
        }

        if (board[0][0] == cellValues && board[1][1] == cellValues && board[2][2] == cellValues) {
            return true;
        }
        return board[0][2] == cellValues && board[1][1] == cellValues && board[2][0] == cellValues;
    }


    public boolean isBoardFull() {
        for (CellValues[] cellValues : board) {
            for (CellValues cellValue : cellValues) {
                if (cellValue == CellValues.EMPTY) return false;
            }

        }
        return true;
    }

    public void switchPlayer() {
        player = !player;
    }
}
