package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopiesTest {

    @Test
    public void testFourCopiesBelow() {

        int copy = Function.copies(2);

        assertEquals(2000,copy);

    }

    @Test
    public void testNineCopiesBelow() {
        int copy = Function.copies(7);
        assertEquals(1800,copy);
    }

    @Test
    public void testTwentyNineBelow() {
        int copy = Function.copies(21);
        assertEquals(1600,copy);
    }


    @Test
    public void testFortyNineBelow() {
        int copy = Function.copies(36);
        assertEquals(1500,copy);
    }


    @Test
    public void testNinetyNineBelow() {
        int copy = Function.copies(67);
        assertEquals(1300,copy);
    }


    @Test
    public void testHundredAndNinetyNineBelow() {
        int copy = Function.copies(171);
        assertEquals(1200,copy);
    }


    @Test
    public void testFourHundredNinetyNineBelow() {
        int copy = Function.copies(411);
        assertEquals(1100,copy);
    }


    @Test
    public void testFiveHundredAbove() {
        int copy = Function.copies(551);
        assertEquals(1000,copy);
    }

}