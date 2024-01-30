package Leetcode;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> value = new ArrayList<>();


        int[] removeNumberOneDuplicate = removeDuplicate(nums1);
        int[] removeNumberTwoDuplicates = removeDuplicate(nums2);

        Set<Integer> firstSet = convertToSet(removeNumberOneDuplicate);
        Set<Integer> secondSet = convertToSet(removeNumberTwoDuplicates);


        Set<Integer> uniquesSet1 = new HashSet<>(firstSet);
        uniquesSet1.removeAll(secondSet);

        Set<Integer> uniquesSet2 = new HashSet<>(secondSet);
        uniquesSet2.removeAll(firstSet);


       value.add(new ArrayList<>(uniquesSet1));
        value.add(new ArrayList<>(uniquesSet2));
        return value;
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


}
