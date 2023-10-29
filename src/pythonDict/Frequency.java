package pythonDict;

import java.util.ArrayList;
import java.util.Arrays;


public class Frequency {
    public static void main(String[] args) {
        int[] tuple5 = {1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 7};
        System.out.println(Arrays.toString(frequencyOf(2, tuple5)));

}

public static int[] frequencyOf(int number, int... elements){
        ArrayList<Integer> value = new ArrayList<>();


    unpack(number, elements, value);
    return convertToArray(value);
}

    private static void unpack(int number, int[] elements, ArrayList<Integer> value) {
        for (int index = 0; index < elements.length; index++){
            int unpackNumber = elements[index];
            boolean isDuplicate = false;

            for (int temp = 0; temp < index; temp++) {
                if (elements[temp] == unpackNumber) {
                    isDuplicate = true;
                    break;
                }
            }

            removeDuplicate(number, elements, value, unpackNumber, isDuplicate);
        }
    }

    private static void removeDuplicate(int number, int[] elements, ArrayList<Integer> value, int unpackNumber, boolean isDuplicate) {
        int count = 0;
        for(int element : elements){
            if (element == unpackNumber) count++;
        }

        if(count > number) {
            if (!isDuplicate) value.add(unpackNumber);
        }
    }

    private static int[] convertToArray(ArrayList<Integer> items){
        int[] array = new int[items.size()];

        for (int index = 0; index < items.size(); index++) {
            array[index] = items.get(index);
        }

        return array;
    }



}
