package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    @Test void testOne(){
        int[] input = {1,2,3};
        int[] expected = {1,2,4};
        assertArrayEquals(expected,PlusOne.plusOne(input));
    }

    @Test void testTwo(){
        int[] input = {9};
        int[] expected = {1,0};
        assertArrayEquals(expected,PlusOne.plusOne(input));
    }

    @Test void testThree(){
        int[] input = {4,3,2,1};
        int[] expected = {4,3,2,2};
        assertArrayEquals(expected,PlusOne.plusOne(input));
    }

    @Test void testFour(){
        int[] input = {1,2,9};
        int[] expected = {1,3,0};
        assertArrayEquals(expected,PlusOne.plusOne(input));
    }



}