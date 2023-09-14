package Chapter4;

import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base length of the triangle between 1 and 10");
        int length = scan.nextInt();
        System.out.println();



       if ( (length > 0) &&  (length <= 10) ) {

            for (int row = 1; row <= length; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }}

       else {
           System.out.println("Invalid!!! ,Enter a number between 1 and 10");
            }


    }
}
