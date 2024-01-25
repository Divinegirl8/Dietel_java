package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    @Test void testOne(){
        int[] nums = {2,2,1};
        assertEquals(2,removeDuplicates.removeDuplicates(nums));
    }


}