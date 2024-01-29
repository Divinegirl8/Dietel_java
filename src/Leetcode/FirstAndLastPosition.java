package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastPosition {




    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> value = new ArrayList<>();
        Arrays.sort(nums);



        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target){
                value.add(index);
            }

        }

        if (value.size() > 2){
            value.subList(1, value.size() - 1).clear();

        }

        if (value.isEmpty()){
            value.add(-1);
            value.add(-1);
        }
        if (value.size() == 1){
            value.add(value.get(0));
        }



        return convertToArray(value);

    }



    private int[] convertToArray(ArrayList<Integer> newValue){
        int[] value = new int[newValue.size()];

        for (int index = 0; index < newValue.size(); index++) {
            value[index] = newValue.get(index);
        }
        return value;
    }


}
