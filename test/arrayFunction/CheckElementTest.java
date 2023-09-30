package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.checkElement;

class CheckElementTest {

    @Test
    public void testElementOne()  {
        int[] numbers = {1,4,5,100,7};
        int result = 7;
        assertTrue(checkElement(numbers,result));
    }

    @Test
    public void testElementTwo()  {
        int[] numbers = {1,4,5,100,7};
        int result = 15;
        assertFalse(checkElement(numbers,result));
    }

    @Test
    public void testElementThree()  {
        int[] numbers = {1,4,5,100,7};
        int result = -115;
        assertFalse(checkElement(numbers,result));
    }

    @Test
    public void testElementFour()  {
        int[] numbers = {1,4,5,100,7};
        int result = -0;
        assertFalse(checkElement(numbers,result));
    }

    @Test
    public void testElementFive()  {
        int[] numbers = {1,4,5,100,7};
        int result = 100;
        assertTrue(checkElement(numbers,result));
    }


}