package BinarySnacks;

import java.util.Scanner;
import static BinarySnacks.BinaryFunction.*;

public class DecimalToBinaryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        String value = scan.nextLine();

        while (!value.matches("\\d+")){
            System.out.println("Error number should be positive!!! "+ "\nEnter Again: ");
            value = scan.nextLine();
        }
        int number = Integer.parseInt(value);

        System.out.println(number + " to binary number is " + decimalToBinary(number));
    }
}
