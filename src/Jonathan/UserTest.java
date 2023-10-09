package Jonathan;

import java.util.Arrays;
import java.util.Scanner;

import static Jonathan.DataCollection.data;
import static Jonathan.GetRow.rowElement;
import static Jonathan.GetColumn.getColumn;

public class UserTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of row(s): ");
        int rowLen = scan.nextInt();
        System.out.println("Enter the number of column(s): ");
        int coLum = scan.nextInt();
        System.out.println("Enter array data(s):");
        int[][] val = data(rowLen, coLum);
        System.out.println("The value you inputted in your data set is: " + "\n" + Arrays.deepToString(val));

        System.out.println();


        System.out.println("Enter the row you want to print the values: ");
        int row2 = scan.nextInt();
        System.out.println("What index do you want to start from: ");
        int start = scan.nextInt();
        System.out.println("What index do you want to end: ");
        int stop = scan.nextInt();
        System.out.println(Arrays.toString(rowElement(val, row2, start, stop)));

        System.out.println();

        System.out.println("Enter the column you want to print the values: ");
        int column = scan.nextInt();
        System.out.println("What index do you want to start from: ");
        int start1 = scan.nextInt();
        System.out.println("What index do you want to end: ");
        int stop2 = scan.nextInt();
        System.out.println(Arrays.toString(getColumn(val,column,start,stop)));
    }
}
