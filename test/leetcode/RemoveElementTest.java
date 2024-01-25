package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test void testOne(){
        int[] values = {3,2,2,1};
        int val = 1;
        assertEquals(3,RemoveElement.removeElement(values,val));
    }

}