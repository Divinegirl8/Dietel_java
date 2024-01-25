package leetcode;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
         int[] storeValue = new int[2];

        for (int index = 0; index < numbers.length; index++) {
            for (int index2 = 0; index2 < index; index2++) {
                if (numbers[index] + numbers[index2] == target){
                    storeValue[0] = index2 +1;
                    storeValue[1] = index + 1;
                }
            }
        }
        return storeValue;
    }


}
