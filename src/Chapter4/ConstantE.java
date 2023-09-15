package Chapter4;

import java.util.Scanner;

public class ConstantE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms to find the constant e value: ");
        int terms = scan.nextInt();

        double factorial = 1;
        double sum = 0;

        for (int count = 1; count <= terms; count++){

           factorial *= count;

           double divisor = 1 / factorial;
            sum += divisor;



        }
        System.out.printf("%d terms is equals to %.6f " , terms, sum + 1);
    }
}
