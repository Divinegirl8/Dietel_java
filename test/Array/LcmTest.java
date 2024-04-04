package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.Lcm.*;

class LcmTest {
    @Test void testOne(){
        int[] elements = {8,16,12};
        int result = 48;

        assertEquals(result,lcm(elements));
    }

    @Test void testTwo(){
        int[] elements = {2,4};
        int result = 4;

        assertEquals(result,lcm(elements));
    }

    @Test void testThree(){
        int[] elements = {15,3};
        int result = 15;

        assertEquals(result,lcm(elements));
    }

}