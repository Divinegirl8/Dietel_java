package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.GuessNumber.*;


class GuessNumberTest {

    @Test

    void testNumberWasGenerated(){
        boolean expected = randomNumberGenerator() >= 1 && randomNumberGenerator() <= 1000;
        assertTrue(expected);
    }

    @Test

    void testPromptUser(){
        String expected = "Guess a number between 1 and 1000.";
        assertEquals(expected,promptUser());
    }

    @Test

    void testTooHigh(){
        String expected =  "Too high. Try again.";
        assertEquals(expected,displayHigh());
    }


}