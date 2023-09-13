package PYTHON;

import java.util.Scanner;

public class SeperateDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number containing five digits: ");
        int number = scan.nextInt();

//        for (int count = 5; count > 0; count--){
//            int digit = number / (int)Math.pow(10,count) % 10;
//
//
////            int digit =  (int)Math.pow(10,count);
//
//            System.out.print(digit + " ");
//
//        }

        int count = 5;

        while (count > 0){

            count--;

            int digit = number / (int) Math.pow(10,count) % 10;

            System.out.print(digit + " ");
        }


    }
}
