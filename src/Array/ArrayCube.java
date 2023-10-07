package Array;

import java.util.ArrayList;

public class ArrayCube {

    public static ArrayList<Integer> cubeOfList(int[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : args){
            list.add(number * number * number);
        }
        return list;
    }
}
