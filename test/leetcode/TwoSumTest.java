package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test

    void testOne(){
        TwoSum sum = new TwoSum();
        int[] values = {2,7,11,15};
        int[] expected = {0,1};
        assertArrayEquals(expected,sum.twoSum(values,9));

    }

    @Test

    void testTwo(){
        TwoSum sum = new TwoSum();
        int[] values = {3,2,4};
        int[] expected = {1,2};
        assertArrayEquals(expected,sum.twoSum(values,6));

    }

    @Test

    void testThree(){
        TwoSum sum = new TwoSum();
        int[] values = {3,3};
        int[] expected = {0,1};
        assertArrayEquals(expected,sum.twoSum(values,6));

    }

}