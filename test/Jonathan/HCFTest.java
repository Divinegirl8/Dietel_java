package Jonathan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HCFTest {
    @Test void testOne(){
        int[] input = {8,4,12};
        int[] output = {2,2};
        assertArrayEquals(output,HCF.hcf(input));
    }
    @Test void testTwo(){
        int[] input = {6,3,9};
        int[] output = {3};
        assertArrayEquals(output,HCF.hcf(input));
    }

}