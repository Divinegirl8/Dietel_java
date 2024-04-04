package Leetcode;

import java.util.ArrayList;
import java.util.Objects;

public class UniqueCount {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> newValue = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            int count  = 0;
            for (int temp = 0; temp < arr.length; temp++) {
                if (arr[index] == arr[temp]){
                    count++;
                }
            }
            newValue.add(count);

        }
        System.out.println(newValue);
        return checkSameValue(newValue);
    }
//
//    private boolean checkSameValue(ArrayList<Integer> newValue) {
//        for (int index = 0; index < newValue.size(); index++) {
//            for (int temp = 0; temp < newValue.size(); temp++) {
//                if (Objects.equals(newValue.get(index), newValue.get(temp))){
//                    return false;
//                }
//            }
//
//        }
//        return true;
//    }


    private boolean checkSameValue(ArrayList<Integer> newValue) {
        for (int index = 0; index < newValue.size(); index++) {
            int count = 0;
            for (int temp = 0; temp < newValue.size(); temp++) {
               if (newValue.get(index) == newValue.get(temp)){
                   count++;
               }
            }
            if (count > 1){
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        UniqueCount uniqueCount = new UniqueCount();
        int[]  arr = {3,5,-2,-3,-6,-6};
        int[] arr2 = {1,2,2,1,1,3};
        System.out.println(uniqueCount.uniqueOccurrences(arr));
        System.out.println(uniqueCount.uniqueOccurrences(arr2));
    }
}
