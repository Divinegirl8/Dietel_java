package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianArray {

   public static double mergeArray(int[] firstValue, int[] secondValue) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int index = 0; index < firstValue.length; index++) {
            integerArrayList.add(firstValue[index]);
        }
        for (int value = 0; value < secondValue.length; value++) {
            integerArrayList.add(secondValue[value] );
        }

       Collections.sort(integerArrayList);

        double median;
        int size = integerArrayList.size();

        if (size % 2 != 0){
            median = integerArrayList.get(size/2);
        }
        else {
            double middle1 = integerArrayList.get((size/2) - 1);
            double middle2 = integerArrayList.get(size/2 );
            median = (middle1 + middle2) / 2;

        }

        return median;
    }

}
