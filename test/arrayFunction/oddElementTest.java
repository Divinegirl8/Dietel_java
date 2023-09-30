package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.oddElement;

class oddElementTest {

    @Test

    public void testOddElement() {
        int[] numbers = {5,3,8,9,5};
        String result =  " 3 9 ";

        assertEquals(result,oddElement(numbers));
    }

    @Test

    public void testOddElementTwo() {
        int[] numbers = {5,2,8,9,5,10,-2};
        String result =  " 2 9 10 ";

        assertEquals(result,oddElement(numbers));
    }

    @Test

    public void testOddElementThree() {
        int[] numbers = {9,5};
        String result =  " 5 ";

        assertEquals(result,oddElement(numbers));
    }

}