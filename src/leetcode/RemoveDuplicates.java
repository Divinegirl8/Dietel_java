package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0){
        return 0;
    }
    Arrays.sort(nums);

    int uniqueCount = 1;

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[index - 1]){
                nums[uniqueCount] = nums[index];
                uniqueCount++;
            }
        }
        return uniqueCount;

    }



}
