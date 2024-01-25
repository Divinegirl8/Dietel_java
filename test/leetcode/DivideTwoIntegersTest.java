package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {
    @Test void testOne(){
        assertEquals(3,DivideTwoIntegers.divide(10,3));
    }

    @Test void testTwo(){
        assertEquals(-2,DivideTwoIntegers.divide(7,-3));
    }

}