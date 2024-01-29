package Leetcode;

import java.util.ArrayList;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> newValue = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            int count = 0;
            for (int temp = 0; temp < nums.length; temp++) {
                if (nums[index] == nums[temp]){
                    count++;
                }
            }
            if (count == 1){
               newValue.add(nums[index]);
            }
        }
        return convertToArray(newValue);
    }

    private int[] convertToArray(ArrayList<Integer> newValue){
        int[] value = new int[newValue.size()];

        for (int index = 0; index < newValue.size(); index++) {
            value[index] = newValue.get(index);
        }
        return value;
    }

}
