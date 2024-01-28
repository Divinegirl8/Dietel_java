package leetcode;

import java.util.Arrays;

public class MajorElement {
    public int majorityElement(int[] nums) {
        int max = 0;
        for (int index = 0; index < nums.length; index++) {

            int count = 0;

            for (int temp = 0; temp < nums.length; temp++) {
                if (nums[index] == nums[temp]){
                    count++;
                }
            }


            if (count > nums.length/2){
                max = nums[index];
            }
        }
        return max;
    }

}
