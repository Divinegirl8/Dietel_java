package Leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        int number = 0;

        for (int index = 0; index < nums.length; index++) {
            int count = 0;
            for (int temp = 0; temp < nums.length; temp++) {
                if (nums[index] == nums[temp]){
                    count++;
                }
            }
            if (count == 1){
                number = nums[index];
            }
        }
        return number;
    }
}
