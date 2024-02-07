package Leetcode;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int intersect(int[] nums1, int[] nums2) {
        int[] removeNumberOneDuplicate = removeDuplicate(nums1);
        int[] removeNumberTwoDuplicates = removeDuplicate(nums2);

        Set<Integer> firstSet = convertToSet(removeNumberOneDuplicate);
        Set<Integer> secondSet = convertToSet(removeNumberTwoDuplicates);

        Set<Integer> uniqueSet1 = new HashSet<>(firstSet);
        uniqueSet1.retainAll(secondSet);

        int[] value = uniqueSet1.stream().mapToInt(Integer::intValue).toArray();
       return minimum(value);
    }


    private static Set<Integer> convertToSet(int[] values){
        Set<Integer> set = new HashSet<>();

        for (int value : values) {
            set.add(value);
        }
        return set;
    }


    private static int[] removeDuplicate(int[] values){
        ArrayList<Integer> storeNonDuplicates = new ArrayList<>();

        for (int value : values) {
            if (!storeNonDuplicates.contains(value)) storeNonDuplicates.add(value);
        }
        return convertToArray(storeNonDuplicates);
    }

    private static int[] convertToArray(ArrayList<Integer> newValue){
        int[] value = new int[newValue.size()];

        for (int index = 0; index < newValue.size(); index++) {
            value[index] = newValue.get(index);
        }
        return value;
    }

    private static int minimum(int[] values){
        int min = Integer.MAX_VALUE;
        for (int value : values){
            if (min > value ){
                min = value;
            }
        }
        return min;
    }

}
