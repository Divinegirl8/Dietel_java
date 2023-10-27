package FEMI;

import java.util.ArrayList;

public class DominantNumber {
    public static ArrayList<Integer> arrayOfNumber(int... numbers){
        ArrayList<Integer> numberList = new ArrayList<>();

        int count = 0;
        while (count < numbers.length){

//            if (maximumArray(numbers[count]))
          count++;

        }

        return numberList;
    }


    private static int maximumArray(int... numbers){
        int max = 0;
        for(int number : numbers){
            if(max < number){
                max = number;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maximumArray(9,3,10,7,4));
    }
}
