package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.largestNumberInList;

class LargestNumberTest {

    @Test

    public void largeOne() {
        int[] numbers = {56,43,121,0};
        int integer = largestNumberInList(numbers);
        assertEquals(121,integer);
    }

    @Test

    public void largeTwo() {
        int[] numbers = {56,43,121,200,6,4};
        int integer = largestNumberInList(numbers);
        assertEquals(200,integer);
    }

    @Test

    public void largeThree() {
        int[] numbers = {561,43};
        int integer = largestNumberInList(numbers);
        assertEquals(561,integer);
    }

}