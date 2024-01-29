package leetcode;

import java.util.Arrays;

public class MajorElement {
    public int majorityElement(int[] nums) {
        int max = 0;
        int number = 0;


        for (int num : nums) {
            int count = 0;
            for (int index : nums) {
                if (num == index) {
                    count++;
                }
            }

            if (count > number) {
                max = num;
            }

            number = count;

        }
        return max;


    }

}
