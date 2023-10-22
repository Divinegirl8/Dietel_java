package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static Array.PrimeFactorTree.*;


class PrimeFactorTreeTest {
    @Test

    void testPrimeTree(){
        int number = 310;
        ArrayList<Integer> expected = primeTree(number);
        assertEquals(5,expected.get(1));
    }

    @Test
    void testPrimeTreeTwo(){
        int number = 12;
        ArrayList<Integer> expected = primeTree(number);
        assertEquals(2,expected.get(0));
        assertEquals(3,expected.get(2));
    }

    @Test

    void testPrimeTreeThree(){
        ArrayList<Integer> expected = primeTree(-13);
        assertEquals(13,expected.get(0));
    }
}