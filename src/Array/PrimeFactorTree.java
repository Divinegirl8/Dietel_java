package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorTree {
    public static int[] primeTree(int digit) {
        int number;
        if (digit < 0){
            number = digit * -1;
        }
        else {
            number = digit;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int index = 2;
        while ( index <= number) {
            while (number % index == 0) {
                result.add(index);
                number /= index;

            }
            ++index;
        }
        return convertToArray(result);
    }


    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] list_of_numbers = new int[result.size()];

        for (int temp = 0; temp < result.size(); temp++){
            list_of_numbers[temp] = result.get(temp);
        }
        return list_of_numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeTree(310)));
    }

}
