package Jonathan;


import java.util.Scanner;


public class DataCollection {
    public static int[][] data(int row, int column){
        Scanner scan = new Scanner(System.in);
        int[][] value = new int[row][column];

        for (int inner = 0; inner < row; inner++) {
            for (int outer = 0; outer < column; outer++) {
                value[inner][outer] = scan.nextInt();
            }
        }

        return value;
    }


}
