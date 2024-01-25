package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static java.util.Arrays.sort;

public class RemoveElement {
  ;
    public static int removeElement(int[] nums, int val) {
          int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val){
                nums[count++] = nums[index];


            }
        }

        return count;
        }


}
