package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusArrayTest {
    @Test void testOne(){
        int[] input = {2,3,5,6,7,2,1};
        int[] expected = {5,11,9,1};
        assertArrayEquals(expected,PlusArray.plusArray(input));
    }


    @Test void testTwo(){
        int[] input = {3,4,5,1,5};
        int[] expected = {7,6,5};
        assertArrayEquals(expected,PlusArray.plusArray(input));
    }

    @Test void testThree(){
        int[] input = {3,4,5,1,5,1,-1,1};
        int[] expected = {7,6,6,0};
        assertArrayEquals(expected,PlusArray.plusArray(input));
    }

}