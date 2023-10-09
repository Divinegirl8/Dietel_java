package PYTHON.pythonTuple;

import java.util.ArrayList;

public class Unpacking {
    public static ArrayList<Integer> unpack(int[] numbers){
        ArrayList<Integer> new_list = new ArrayList<>();
            new_list.add(numbers[numbers.length - 1]);
            new_list.add(numbers[0]);
            return new_list;

    }

}
