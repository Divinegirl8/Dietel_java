package ticTacToePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
@Test void testThatTheCeilInMyBoardContainsEmptyValues(){
        TicTacToe ticTacToe = new TicTacToe();
        CellValues[][] expected = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                                   {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                                   {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(expected,ticTacToe.getBoard());

}

}