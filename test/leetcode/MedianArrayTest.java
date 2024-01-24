package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianArrayTest {
    @Test void testOne(){
        int[] firstValue  = {1,3};
        int[] secondValue = {2};
        double expected = 2.0;
        assertEquals(expected,MedianArray.mergeArray(firstValue,secondValue));
    }

    @Test void testTwo(){
        int[] firstValue  = {1,2};
        int[] secondValue = {3,4};
        double expected = 2.5;
        assertEquals(expected,MedianArray.mergeArray(firstValue,secondValue));
    }



}