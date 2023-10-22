package Array;

import java.util.ArrayList;

public class PrimeFactorTree {
    public static ArrayList<Integer> primeTree(int digit) {
        int number;
        if (digit < 0){
            number = digit * -1;
        }
        else {
            number = digit;
        }
        ArrayList<Integer> list_of_numbers = new ArrayList<>();

        int index = 2;
        while ( index <= number) {
            while (number % index == 0) {
                list_of_numbers.add(index);
                number /= index;

            }
            ++index;
        }
        return list_of_numbers;
    }
}
