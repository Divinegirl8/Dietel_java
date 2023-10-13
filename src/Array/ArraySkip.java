package Array;

import java.util.Arrays;

public class ArraySkip {
public static int sumValues(int... numbers){
    int total = 0;

    for (int count = 0; count < numbers.length;count++){
        total += numbers[count];
    }

    return total;
}

public static int findMax(int... numbers){
    int large = 0;
    for (int count: numbers){
        if(large < count){
            large = count;
        }
    }
    return large;
}


    public static int findMin(int... numbers){
        int smallest = numbers[0];
        for (int count: numbers){
            if(smallest > count){
                smallest = count;
            }
        }
        return smallest;
    }

    public static String findValues(int... numbers){
    int[] show = {sumValues(numbers) - findMin(numbers),sumValues(numbers)-findMax(numbers)};
    return Arrays.toString(show);
    }



}
