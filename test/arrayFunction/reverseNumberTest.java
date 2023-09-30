package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.reverseNumber;

class reverseNumberTest {

    @Test

    public void testReverse(){
        int[] numbers = {56,43,121,200,6,9};
        String result = " 9 6 200 121 43 56 ";
        assertEquals(result,reverseNumber(numbers));

    }

    @Test

    public void testReverseTwo(){
        int[] numbers = {56,43};
        String result = " 43 56 ";
        assertEquals(result,reverseNumber(numbers));

    }

    @Test

    public void testReverseThree(){
        int[] numbers = {200,345,155,10};
        String result = " 10 155 345 200 ";
        assertEquals(result,reverseNumber(numbers));

    }

    @Test

    public void testReverseFour(){
        int[] numbers = {200,345,155,10,-23,0};
        String result = " 0 -23 10 155 345 200 ";
        assertEquals(result,reverseNumber(numbers));

    }

}