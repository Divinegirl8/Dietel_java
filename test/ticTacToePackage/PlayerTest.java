package ticTacToePackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToePackage.exceptionPackage.InvalidInputException;
import ticTacToePackage.exceptionPackage.SpaceIsOccupiedError;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    TicTacToe ticTacToe;

    @BeforeEach
    void setUp(){
        player = new Player();
       ticTacToe = new TicTacToe();
    }


    @Test void testThatAMoveIsMadeWhenPlayerPlays(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());
       ;

        CellValues[][] expectedValues = {{CellValues.X, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};


        assertArrayEquals(expectedValues,player.play("1"));

    }

    @Test void testThatErrorOccursWhenPlayerChoosesSameNumber(){

        player.play("1");
        assertThrows(SpaceIsOccupiedError.class,()->player.play("1"));
    }

    @Test void testThatAMoveIsMadeWhenFirstPlayerPlaysForTheFirstTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());
        ;

        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");

        assertArrayEquals(expectedValues,player.play("2"));

    }
    @Test void testThatAMoveIsMadeWhenSecondPlayerPlaysForTheFirstTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");


        assertArrayEquals(expectedValues,player.play("2"));

    }

    @Test void testThatAMoveIsMadeWhenFirstPlayerPlaysForTheSecondTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.EMPTY,CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");
        player.play("2");


        assertArrayEquals(expectedValues,player.play("3"));

    }

    @Test void testThatAMoveIsMadeWhenSecondPlayerPlaysForTheSecondTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());
        ;

        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");
        player.play("2");
        player.play("3");


        assertArrayEquals(expectedValues,player.play("4"));

    }

    @Test void testThatAMoveIsMadeWhenFirstPlayerPlaysForTheThirdTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());
        ;

        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.X, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");
        player.play("2");
        player.play("3");
        player.play("4");


        assertArrayEquals(expectedValues,player.play("5"));

    }


    @Test void testThatAMoveIsMadeWhenSecondPlayerPlaysForTheThirdTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.X, CellValues.O},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");
        player.play("2");
        player.play("3");
        player.play("4");
        player.play("5");

        assertArrayEquals(expectedValues,player.play("6"));

    }

    @Test void testThatAMoveIsMadeWhenFirstPlayerPlaysForTheFourthTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.X, CellValues.O},
                {CellValues.X, CellValues.EMPTY, CellValues.EMPTY}};

        player.play("1");
        player.play("2");
        player.play("3");
        player.play("4");
        player.play("5");
        player.play("6");


        assertArrayEquals(expectedValues,player.play("7"));

    }

    @Test void testThatAMoveIsMadeWhenSecondPlayerPlaysForTheFourthTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.X, CellValues.O},
                {CellValues.X, CellValues.O, CellValues.EMPTY}};

        player.play("1");
        player.play("2");
        player.play("3");
        player.play("4");
        player.play("5");
        player.play("6");
        player.play("7");


        assertArrayEquals(expectedValues,player.play("8"));

    }


    @Test void testThatAMoveIsMadeWhenFirstPlayerPlaysForTheLastTime(){
        CellValues[][] initialValues = {{CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY},
                {CellValues.EMPTY, CellValues.EMPTY, CellValues.EMPTY}};
        assertArrayEquals(initialValues,ticTacToe.getBoard());


        CellValues[][] expectedValues = {{CellValues.X, CellValues.O, CellValues.X},
                {CellValues.O ,CellValues.X, CellValues.O},
                {CellValues.X, CellValues.O, CellValues.X}};

        player.play("1");
        player.play("2");
        player.play("3");
        player.play("4");
        player.play("5");
        player.play("6");
        player.play("7");
        player.play("8");

        assertArrayEquals(expectedValues,player.play("9"));

    }

    @Test void testThatAnErrorOccursWhenPlayerEntersValueGreaterThanNine(){
        assertThrows(InvalidInputException.class,() -> player.play("10"));
    }

    @Test void testThatAnErrorOccursWhenPlayerEntersValueLesserThanZeroOrZero(){
        assertThrows(InvalidInputException.class,() -> player.play("0"));
        assertThrows(InvalidInputException.class,() -> player.play("-2"));
    }

    @Test void testThatAnErrorOccursWhenPlayerEntersValueThatIsNOtANumber(){
        assertThrows(InvalidInputException.class,() -> player.play("abc"));
        assertThrows(InvalidInputException.class,() -> player.play("--@@"));
    }









}