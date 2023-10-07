package Array;
import  java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int rowLen = scan.nextInt();
        System.out.println("Enter Column: ");
        int coLum = scan.nextInt();
        System.out.println("Enter Numbers: ");


        System.out.println(getRow(rowLen,coLum));

    }
    public static String getRow(int row, int column){
        Scanner scan = new Scanner(System.in);
        int[][] values = new int[row][column];

        for (int outerloop = 0; outerloop < row; outerloop++){
            for (int innerloop = 0; innerloop < column; innerloop++) {
                values[outerloop][innerloop] = scan.nextInt();

            }
        }
        return Arrays.deepToString(values);

    }
}
