package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Array.VariableLength.hcfOf;
import static org.junit.jupiter.api.Assertions.*;
import static Array.PrimeFactorTree.*;


class PrimeFactorTreeTest {
    @Test

    void testPrimeTree(){
        int number = 310;
        int[] result = {2,5,31};

        assertArrayEquals(result,primeTree(number));
    }

    @Test
    void testPrimeTreeTwo(){
        int number = 12;
        int[] result = {2,2,3};
        assertArrayEquals(result,primeTree(number));

    }

    @Test

    void testPrimeTreeThree(){
         int[] result = {2,2};
        assertArrayEquals(result,primeTree(4));
    }
}