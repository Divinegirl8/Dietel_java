package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.VariableLength.*;

class VariableLengthTest {
    @Test

    void testOne(){
     int[] result = {2,3};
     assertArrayEquals(result, hcfOf(6,12,18));
    }

    @Test
    void testTwo() {
        int[] result = {3};
        assertArrayEquals(result, hcfOf(3,12,21,24));
    }

    @Test

    void  testThree(){
        int[] result = {2,2};
        assertArrayEquals(result, hcfOf(4));
    }
    @Test
    void testSomething(){
        int[] result = {3, 3};
        assertArrayEquals(result, hcfOfHusband(9, 27));
    }

}