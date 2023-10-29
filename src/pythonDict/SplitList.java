package pythonDict;

import java.util.Arrays;
import java.util.Scanner;

public class SplitList {
    public static int[] split1(int... numbers){
        int[] newList = new  int[numbers.length/2];
        for (int index = 0; index < numbers.length / 2; index++) {
            newList[index] = numbers[index];
        }
        return newList;
    }

    public static int[] split2(int... numbers){
        int[] newList = new  int[numbers.length/2];
        int count = 0;
        for (int index = numbers.length/2 ; index < numbers.length; index++) {
            newList[count] = numbers[index];
            count++;
        }
        return newList;
    }

    public static String joinBothList(int[] integer, int[] numbers){
        return String.format("%s , %s", Arrays.toString(integer), Arrays.toString(numbers));
    }



}
