package Jonathan;

import java.util.ArrayList;

public class PlusArray {
    public static int[] plusArray(int[] values) {
        ArrayList<Integer> plus = new ArrayList<>();
        int store = values.length - 1;

        for (int index = 0; index < values.length - 1; index += 2) {
            plus.add(values[index] + values[index + 1]);
        }

        if (values.length % 2 != 0) {
            plus.add(values[store]);
        }

        return convertToArray(plus);
    }

    private static int[] convertToArray(ArrayList<Integer> newValue){
        int[] value = new int[newValue.size()];

        for (int index = 0; index < newValue.size(); index++) {
            value[index] = newValue.get(index);
        }
        return value;
    }


}


