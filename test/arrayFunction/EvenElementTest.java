package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.evenElement;

class EvenElementTest {

    @Test
    public void testEvenElement(){
        int[] numbers = {300,435,237,564,764};
        String result = " 300 237 764 ";
        assertEquals(result,evenElement(numbers));
    }

    @Test
    public void testEvenElementTwo(){
        int[] numbers = {435,237};
        String result = " 435 ";
        assertEquals(result,evenElement(numbers));
    }

    @Test
    public void testEvenElementThree(){
        int[] numbers = {300,435,237,564,764,543,876,321};
        String result = " 300 237 764 876 ";
        assertEquals(result,evenElement(numbers));
    }

    @Test
    public void testEvenElementFour(){
        int[] numbers = {0,-1};
        String result = " 0 ";
        assertEquals(result,evenElement(numbers));
    }

}