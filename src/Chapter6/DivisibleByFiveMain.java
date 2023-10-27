package Chapter6;
import java.util.Scanner;

import static Chapter6.DivisibleByFive.*;
public class DivisibleByFiveMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            System.out.println(divisibleByFive(number));

        }
    }
}
