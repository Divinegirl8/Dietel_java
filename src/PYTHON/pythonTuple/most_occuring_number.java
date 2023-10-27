package PYTHON.pythonTuple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class most_occuring_number {
    public static void main(String[] args) {
       int[] tuple5 = {20, 10, 15, 20, 5, 30, 10, 35, 10, 40, 45, 5};
       ArrayList<Integer> new_list = new ArrayList<>();

        for (int number : tuple5) {
            new_list.add(number);
        }

        ArrayList<Integer> listDigit = new ArrayList<>();

        for (int initialDigit : tuple5) {
            int count = 0;
            for (int integer : new_list) {
                if (initialDigit == integer) {
                    count += 1;
                }
            }
            if (count >= 2) {
                listDigit.add(initialDigit);
            }
        }

        System.out.println(listDigit);


    }
}
