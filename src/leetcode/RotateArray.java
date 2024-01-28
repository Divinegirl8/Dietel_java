package leetcode;

import java.util.Arrays;

public class RotateArray {

    public  void rotate(int[] nums,int k) {
       int lengthOfNums = nums.length;
       k %= lengthOfNums;

       rotateValue(nums,0,lengthOfNums-1);
       rotateValue(nums,0,k-1);
       rotateValue(nums,k,lengthOfNums-1);

        System.out.println(Arrays.toString(nums));
    }

    private void rotateValue(int[] numbers, int start,int end){
        while (start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    private static int getTotal(int[] arrays, int number) {
        return (arrays.length) - number;
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] v = {1,2,3,4,5,6,7};
        rotateArray.rotate(v,3);

        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotateArray.rotate(nums,k);

        int[] numb = {1};
        int w = 2;
        rotateArray.rotate(numb,w);


    }
}
