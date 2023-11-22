package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] newContainer = new int[2];

        for (int index = 0; index < nums.length; index++) {;
            for (int index2 = 0; index2 < index; index2++) {
                if(nums[index] + nums[index2] == target){
                    newContainer[0] = index2;
                    newContainer[1] = index;
                }
               }
        }
        return newContainer;
    }


}
