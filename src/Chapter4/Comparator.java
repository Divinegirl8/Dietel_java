package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scan.nextInt();

        System.out.println("Enter second number: ");
        int second = scan.nextInt();


        if (first == second) {
            System.out.println("0");
       }
       if (first > second) {
          System.out.println("1");
      }
       if(second < first) {
           System.out.println("-1");
       }
    }
}
