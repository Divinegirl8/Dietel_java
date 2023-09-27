package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitTest {

    @Test
    public void testSum() {
        long result = Function.sumDigits(234);
        assertEquals(9,result);
    }


    @Test
    public void testSumTwo() {
        long result = Function.sumDigits(2334);
        assertEquals(12,result);
    }


    @Test
    public void testSumThree() {
        long result = Function.sumDigits(234555);
        assertEquals(24,result);
    }


    @Test
    public void testSumFour() {
        long result = Function.sumDigits(11);
        assertEquals(2,result);
    }


    @Test
    public void testSumFive() {
        long result = Function.sumDigits(2);
        assertEquals(2,result);
    }

    @Test
    public void testSumSix() {
        long result = Function.sumDigits(4-2);
        assertEquals(2,result);
    }

    @Test
    public void testSumSeven() {
        long result = Function.sumDigits(-2-2);
        assertEquals(-4,result);
    }

    @Test
    public void testSumEight() {
        long result = Function.sumDigits(-20);
        assertEquals(-2,result);
    }

    @Test
    public void testSumNine() {
        long result = Function.sumDigits(-2+2);
        assertEquals(0,result);
    }

    @Test
    public void testSumTen() {
        long result = Function.sumDigits(-2+2-5+2);
        assertEquals(-3,result);
    }

    @Test
    public void testSumEleven() {
        long result = Function.sumDigits(-2+2-5+2+1-1+6-7);
        assertEquals(-4,result);
    }


}