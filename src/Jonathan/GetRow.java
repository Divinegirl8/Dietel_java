package Jonathan;


import  java.util.Arrays;
public class GetRow {
    public static  int[] rowElement(int[][] dataset, int row , int start , int stop){
        int[] new_array = new int[(stop - start) + 1];
        int[] value = dataset[row - 1];
        int count = 0;
        for (int startPosition = start - 1; startPosition < stop; startPosition++) {
            new_array[count] = value[startPosition];
            count++;
        }

        return new_array;


    }
}
