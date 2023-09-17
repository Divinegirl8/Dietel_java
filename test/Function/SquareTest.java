package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testIsSquare() {
        boolean number = Function.isSquare(16);
        assertTrue(number);
    }

    @Test
    public void testIsSquareTwo() {
        boolean number = Function.isSquare(81);
        assertTrue(number);
    }


    @Test
    public void testIsNotSquare() {
        boolean number = Function.isSquare(8);
        assertFalse(number);
    }

    @Test
    public void testIsNotSquareTwo() {
        boolean number = Function.isSquare(120);
        assertFalse(number);
    }

}