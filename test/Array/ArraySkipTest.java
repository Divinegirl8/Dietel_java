package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static Array.ArraySkip.*;

class ArraySkipTest {
    @Test
    public void testSum(){
        int[] numbers = {5,3,4,1,2};
        int[] number = {1,1,1,5,5,5};
        assertEquals(15,sumValues(numbers));
        assertEquals(18,sumValues(number));


    }

    @Test

    public void testMax(){
        int[] numbers = {5,3,4,1,2};
        assertEquals(5,findMax(numbers));
    }

    @Test

    public void testMin(){
        int[] numbers = {5,3,4,1,2};
        assertEquals(1,findMin(numbers));
    }

    @Test

    public void testFind(){
        int[] numbers = {5,3,4,1,2};
        int[] number = {1,1,1,5,5,5};
        String output = "[14, 10]";
        String output2 = "[17, 13]";
        assertEquals(output,findValues(numbers));
        assertEquals(output2,findValues(number));
    }


}