package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.Swap.*;

class SwapTest {
    @Test

    void testOne(){
        int[] value = {42, 18, 41, 22, 15,12};
        int[] result = {18, 42, 22, 41, 12, 15};
        assertArrayEquals(result,swap(value));
    }


    @Test

    void testTwo(){
        int[] value = {42, 18, 41, 22, 15};
        int[] result = {18, 42, 22, 41,15};
        assertArrayEquals(result,swap(value));
    }

    @Test

    void testThree(){
        int[] value = {42, 15,18,13,13,16};
        int[] expected = {42, 15, 13, 18, 13, 16};
        assertArrayEquals(expected,swap2(value));
    }

    @Test

    void testFour(){
        int[] value = {42, 15,18,13,13};
        int[] expected = {42, 15, 13, 18, 13};
        assertArrayEquals(expected,swap2(value));
    }

}