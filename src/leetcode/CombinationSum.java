package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(result, new ArrayList<>(), candidates, target, 0);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int remainingTarget, int start) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            int currentCandidate = candidates[i];

            if (currentCandidate > remainingTarget) {
                break;
            }

            currentList.add(currentCandidate);
            backtrack(result, currentList, candidates, remainingTarget - currentCandidate, i + 1);
            currentList.remove(currentList.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates,target));
    }
}

