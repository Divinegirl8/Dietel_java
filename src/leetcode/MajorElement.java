package leetcode;

public class MajorElement {
    public int majorityElement(int[] nums) {
        int value = 0;
        for (int index = 0; index < nums.length; index++) {

            int count = 0;

            for (int temp = 0; temp < nums.length; temp++) {
                if (nums[index] == nums[index]){
                    count++;
                }
            }

            int max = 0;

            if (count > max){
                value = nums[index];
            }
        }
        return value;
    }
}
