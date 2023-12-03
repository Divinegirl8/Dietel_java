package ticTacToePackage;

import java.util.Arrays;

public class TicTacToe {
    private final CellValues[][] board;

    public TicTacToe(){
        board = new CellValues[3][3];
        for (CellValues[] values : board){
            Arrays.fill(values, CellValues.EMPTY);
        }
    }

    public CellValues[][] getBoard(){
        return board;
    }

}
