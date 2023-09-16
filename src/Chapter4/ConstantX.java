package Chapter4;

import Function.Function;

import java.util.Scanner;

public class ConstantX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of terms you want to calculate: ");
        int terms = scan.nextInt();

        System.out.println("Enter the base: ");
        int base = scan.nextInt();

        double factorial = 1;
        double sum = 0;

        for (int count = 1; count <= terms; count++){
            factorial *= count;
            double divisor = Function.numberPower(base,count) / factorial;
            sum += divisor;

        }
        System.out.printf("The constant eX is %.6f",sum + 1);
    }
}
