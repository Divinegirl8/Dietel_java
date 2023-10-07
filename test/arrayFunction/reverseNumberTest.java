package arrayFunction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.reverseNumber;

class reverseNumberTest {

    @Test

    public void testReverse(){
        int[] numbers = {56,43,121,200,6,9};

        ArrayList<Integer> result = reverseNumber(numbers);

        assertEquals(9, result.get(0));
        assertEquals(6, result.get(1));
        assertEquals(200, result.get(2));
        assertEquals(121, result.get(3));
        assertEquals(43, result.get(4));
        assertEquals(56, result.get(5));
    }

    @Test

    public void testReverseTwo(){
        int[] numbers = {56,43};
        ArrayList<Integer> result = reverseNumber(numbers);
        assertEquals(43,result.get(0));
        assertEquals(56,result.get(1));

    }

    @Test

    public void testReverseThree(){
        int[] numbers = {200,345,155,10};
        ArrayList<Integer> result = reverseNumber(numbers);
        assertEquals(10,result.get(0));
        assertEquals(155,result.get(1));
        assertEquals(345,result.get(2));
        assertEquals(200,result.get(3));


    }

    @Test

    public void testReverseFour(){
        int[] numbers = {200,345,155,10,-23,0};
        ArrayList<Integer> result = reverseNumber(numbers);
        assertEquals(0,result.get(0));
        assertEquals(-23,result.get(1));
        assertEquals(10,result.get(2));
        assertEquals(155,result.get(3));
        assertEquals(345,result.get(4));
        assertEquals(200,result.get(5));

    }

}