package pythonDict;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pythonDict.Difference.*;

class DifferenceTest {
@Test
    void testMaximum(){
    int[] sample_input = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
    assertEquals(75,maximum(sample_input));
}

    @Test
    void testMaximumTwo(){
        int[] sample_input = {10, -75, 20, 30, 15, 5, 40, 25, 40, 35};
        assertEquals(40,maximum(sample_input));
    }

    @Test
    void testMinimum(){
        int[] sample_input = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
        assertEquals(5,minimum(sample_input));
    }

    @Test
    void testMinimumTwo(){
        int[] sample_input = {10, -75, 20, 30, 15, 5, 40, 25, 40, 35};
        assertEquals(-75,minimum(sample_input));
    }

    @Test
    void testDifferenceOf(){
        int[] sample_input = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
        assertEquals(70,differenceOf(sample_input));
    }

    @Test
    void testDifferenceOfTwo(){
        int[] sample_input = {10, -75, 20, 30, 15, 5, 40, 25, 40, 35};
        assertEquals(115,differenceOf(sample_input));
    }
}