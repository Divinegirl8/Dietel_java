package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    public static int[] eratosthenes(int start, int end){
        ArrayList<Integer> value = new ArrayList<>();

        int changeStart;
        int changeEnd;

        if (start < 0){
            changeStart = start * -1;
        }

        else {
            changeStart = start;
        }

        if (end < 0){
            changeEnd = end * -1;
        }
        else {
            changeEnd = end;
        }

        for (int count = changeStart; count <= changeEnd; count++){
            if (primeNumber(count) > 0){
            value.add(primeNumber(count));
        }}

        return convertToArray(value);
    }

    public static int primeNumber(int number){
       int store = 0;

        int lengthOfNumbers = 0;

        for (int count = 1; count <= number; count++){

            if(number % count == 0) {
                lengthOfNumbers++;
            }

        }

        if (lengthOfNumbers == 2) {store = number;}

        return store;
    }

    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] list_of_numbers = new int[result.size()];

        for (int temp = 0; temp < result.size(); temp++){
            list_of_numbers[temp] = result.get(temp);
        }
        return list_of_numbers;
    }



}
