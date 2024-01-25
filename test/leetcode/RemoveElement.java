package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
  ;
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val){
                newList.add(nums[index]);
            }
        }
        return newList.size();
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3,1};
        int val = 3;
        System.out.println(removeElement.removeElement(nums, val));
    }
}
