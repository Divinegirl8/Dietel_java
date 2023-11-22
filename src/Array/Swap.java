package Array;

import java.util.Arrays;

public class Swap {

    public static int[] swap(int[] value){
        int count = 0;

        for (int index = 1; index < value.length; index+=2) {
            int store = value[count];
            value[count] = value[index];
            value[index] = store;
            count += 2;
        }

        return value;
        
    }

    public static int[] swap2(int[] value){
        int temp = value[2];
        value[2] = value[3];
        value[3] = temp;


        return value;
    }


    public static void main(String[] args) {
        int[] value = {42, 15,18,13,13,16};
        System.out.println(Arrays.toString(swap2(value)));
    }


}