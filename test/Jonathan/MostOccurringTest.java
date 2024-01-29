package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostOccurringTest {
    @Test void test_One(){
        int[] nums = {2,1,1,1,1,2,2};

        assertEquals(1,MostOccurring.mostOccurring(nums));
    }

    @Test void test_Two(){
        int[] nums = {3,4,5,5};
        assertEquals(5,MostOccurring.mostOccurring(nums));
    }


    @Test void test_Three(){
        int[] nums = {3,4,5,5,3,3};
        assertEquals(3,MostOccurring.mostOccurring(nums));
    }

    @Test void test_Four(){
        int[] nums = {1};
        assertEquals(1,MostOccurring.mostOccurring(nums));
    }

    @Test void test_Five(){
        int[] nums = {3,0,0,0};
        assertEquals(0,MostOccurring.mostOccurring(nums));
    }

    @Test void test_Six(){
        int[] nums = {3,-1,-1,0};
        assertEquals(-1,MostOccurring.mostOccurring(nums));
    }
}