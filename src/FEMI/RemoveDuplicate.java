package FEMI;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static ArrayList<Integer> removeOccurrence(int... numbers){
        ArrayList<Integer> result = new ArrayList<>();

        for (int index = 0; index < numbers.length; index++) {
            for (int inner = index + 1; inner < numbers.length; inner++) {
                if (numbers[index] == numbers[inner]){
                    result.add(numbers[inner]);

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tuple5 = {1,2,3,3,2,4,5,5,5,5};
        System.out.println(removeOccurrence(tuple5));
    }

}
