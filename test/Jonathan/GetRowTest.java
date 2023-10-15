package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Jonathan.GetRow.rowElement;
class GetRowTest {
    @Test
    public void testOne() {
        int[][] result = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] output = {1, 2, 3};
        assertArrayEquals(output, rowElement(result, 1, 1, 3));
    }
    @Test
    public void testTwo(){
        int[][] result = {{4, 5, 6}, {7, 8, 9}};
        int[] expected = {8,9};
        assertArrayEquals(expected,rowElement(result,2,2,3));
    }


}