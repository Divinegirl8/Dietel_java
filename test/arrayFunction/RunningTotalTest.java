package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.runningTotal;

class RunningTotalTest {

    @Test
    public void runningTotalTest() {
        int[] numbers = {1,2,3,4};
        String result = " 1 3 6 10 ";
        assertEquals(result,runningTotal(numbers));

    }

    @Test
    public void runningTotalTestTwo() {
        int[] numbers = {1,2,5,4,3};
        String result = " 1 3 8 12 15 ";
        assertEquals(result,runningTotal(numbers));

    }

    @Test
    public void runningTotalTestThree() {
        int[] numbers = {1,2,5,1};
        String result = " 1 3 8 9 ";
        assertEquals(result,runningTotal(numbers));
    }

    @Test
    public void runningTotalTestFour() {
        int[] numbers = {1,2,5,1,-9,-3,2};
        String result = " 1 3 8 9 0 -3 -1 ";
        assertEquals(result,runningTotal(numbers));
    }

}