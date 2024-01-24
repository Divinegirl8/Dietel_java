package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueValues {
    public static int[] uniqueValuesRemovalWithBuiltInFunction(int[] numbersWithUniqueValues){
        List<Integer> withoutUniqueValues = new ArrayList<>();
        for (int number: numbersWithUniqueValues) {
            if (!withoutUniqueValues.contains(number)) withoutUniqueValues.add(number);
        }
      return  convertToArray(withoutUniqueValues);
    }

    private static int[] convertToArray(List<Integer> values){
        int[] newArrayValues = new int[values.size()];

        for (int index = 0; index < values.size(); index++){
            newArrayValues[index] = values.get(index);
        }

        return newArrayValues;
    }

    public static int[] uniqueValuesRemovalWithoutBuiltInFunction(int[] numbersWithUniqueValues){
        int[] listOfNoUniqueValues = new int[numbersWithUniqueValues.length];
        int countNumberOfUniqueValues = 0;

        for (int index = 0; index < numbersWithUniqueValues.length; index++) {
            if (numberNotInList(listOfNoUniqueValues,numbersWithUniqueValues[index]))
            {listOfNoUniqueValues[countNumberOfUniqueValues] = numbersWithUniqueValues[index];
                countNumberOfUniqueValues++;
            }
        }
        return listOfNoUniqueValues;
    }

    public static boolean numberNotInList(int[] numbersWithUniqueValues,int noUniqueValues) {

        for (int number : numbersWithUniqueValues){
            if (number == noUniqueValues) return false;

        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbersWithUniqueValues = {22,22,1,1,5,9,2,3,4,3,5};
        System.out.println(Arrays.toString(uniqueValuesRemovalWithoutBuiltInFunction(numbersWithUniqueValues)));
    }
}
