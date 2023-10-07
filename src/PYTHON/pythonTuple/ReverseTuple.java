package PYTHON.pythonTuple;

import java.util.ArrayList;

public class ReverseTuple {

    public static ArrayList<Integer> reversion(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for (int count = numbers.length-1; count >= 0;count--){
            list.add(numbers[count]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] tuple3 = {15, 25, 60, 50, 30, 40, 45, 55};

        System.out.println(reversion(tuple3));
    }
}
