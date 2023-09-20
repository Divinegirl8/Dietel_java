package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    public void testSecondNumberLesser() {
        int times = Multiply.multiply(2, -3);
        assertEquals(-6,times);
    }

    @Test
    public void testSecondNumberGreater() {
        int times = Multiply.multiply(-2, 3);
        assertEquals(-6,times);
    }

    @Test
    public void testPositive() {
        int times = Multiply.multiply(2, 3);
        assertEquals(6,times);
    }

    @Test
    public void testSecondNumberLess() {
        int times = Multiply.multiply(-2 ,-4);
        assertEquals(8,times);
    }

    @Test
    public void testFirstNumberLess() {
        int times = Multiply.multiply(-4, -2);
        assertEquals(8,times);
    }

    @Test
    public void testZeroinSecondNumber() {
        int times = Multiply.multiply(-4, 0);
        assertEquals(0,times);
    }
    
    @Test
    public void testZeroInFirstNumber() {
        int times = Multiply.multiply(0, -4);
        assertEquals(0,times);
    }

    @Test
    public void testZeroinBothNumber() {
        int times = Multiply.multiply(0, 0);
        assertEquals(0,times);
    }

    @Test
    public void testMinusZeroinBothNumber() {
        int times = Multiply.multiply(-0, -0);
        assertEquals(0,times);
    }

    @Test
    public void testMinusAndPlus() {
        int times = Multiply.multiply(+4, -2);
        assertEquals(-8,times);
    }

    @Test
    public void testMinusAndPlusTwo() {
        int times = Multiply.multiply(-2, +4);
        assertEquals(-8,times);
    }

    @Test
    public void testZero() {
        int times = Multiply.multiply(0, +4);
        assertEquals(0,times);
    }

    @Test
    public void testZeroTwo() {
        int times = Multiply.multiply(+4, 0);
        assertEquals(0,times);
    }


}