package Array;

import java.util.Scanner;
import  java.util.Arrays;

public class ArrayAssignment2 {
    public static String listItems(int row, int column){
        Scanner scan = new Scanner(System.in);

        int[][] list = new int[row][column];

        for (int outerloop = 0; outerloop < row; outerloop++) {
            for (int innerloop = 0; innerloop < column; innerloop++) {
                list[outerloop][innerloop] = scan.nextInt();

            }

        }

return Arrays.deepToString(list);

    }

    public static void main(String[] args) {

        String[] codes = {listItems(3,3)};


        int[] newArray = new int[(3-2) + 1];
        String values = codes[(1)];

        for (int start = 2-1; start < 3; start++){


        }


    }

}
