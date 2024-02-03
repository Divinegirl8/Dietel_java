package Jonathan;

import java.util.ArrayList;
import java.util.Arrays;

public class HCF {

    public static int[] hcf(int[] input) {
        ArrayList<Integer> result = new ArrayList<>();


       int index = 0;
       int count = 2;
       while (index <= input.length){
           while (input[index] % count == 0){
               result.add(count);
               input[index] /= count;
           }

          count--;
           index++;
       }
      return convertToArray(result);


    }
    private static int[] convertToArray(ArrayList<Integer> newValue){
        int[] value = new int[newValue.size()];

        for (int index = 0; index < newValue.size(); index++) {
            value[index] = newValue.get(index);
        }
        return value;
    }

    public static void main(String[] args) {
        int[] input = {6,3,9};
        System.out.println(Arrays.toString(hcf(input)));
    }
}
