package Jonathan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static Jonathan.GetColumn.*;

class GetColumnTest {
    @Test
    public  void testOne() {
        int[][] result ={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12}};
        int[] expected = {1,5,9};
        assertArrayEquals(expected,getColumn(result,1,1,3));
    }

    @Test
    public void testTwo() {
        int[][] result = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        int[] expected = {4,8,12};
        assertArrayEquals(expected,getColumn(result,4,1,3));
    }
}