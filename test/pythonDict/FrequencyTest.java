package pythonDict;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pythonDict.Frequency.frequencyOf;

class FrequencyTest {
    @Test
    void testOne(){
        int[] lists = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 7};
        int[] result = {1,2,5};
        assertArrayEquals(result,frequencyOf(2,lists));
    }

    @Test
    void testTwo(){
        int[] lists = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 7};
        int[] result = {1};
        assertArrayEquals(result,frequencyOf(3,lists));
    }
    @Test
    void testThree(){
        int[] lists = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 7};
        int[] result = {1,2,3,5,6,7};
        assertArrayEquals(result,frequencyOf(0,lists));
    }
    @Test
    void testFour(){
        int[] lists = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 7};
        int[] result = {1,2,3,5};
        assertArrayEquals(result,frequencyOf(1,lists));
    }


}