package FEMI;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.ArraySwap.*;

class ArraySwapTest {
    @Test
    public void testOne(){
        int[] result = {1,2,3,4,5,6};
        int[] expected = {2,1,3,4,5,6};

        assertArrayEquals(expected,swap(result,1,0));
    }

}