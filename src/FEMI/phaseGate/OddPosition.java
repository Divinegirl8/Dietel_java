package FEMI.phaseGate;

import java.util.Arrays;

public class OddPosition {
    public static int[] oddPosition(int[] elements){
        int newLength = (elements.length)/2;
        int[] newArray = new int[newLength];

        for (int index = 1,count = 0;  index < elements.length; index+=2){
            newArray[count++] = elements[index];

        }
        return newArray;
    }



}
