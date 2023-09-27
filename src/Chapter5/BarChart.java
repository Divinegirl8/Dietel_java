package Chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarChart {
public static void chart() {

//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter a number five times(1 - 30): ");
//
//    int number = 0;
//
//    for (int count = 0; count < 5;){
//        System.out.println();
//        System.out.println("Enter a number: ");
//        number = scan.nextInt();
//        if (number <= 30) {
//            count ++;
//            for (int row = 0; row < number; row++)
//            {
//                System.out.print("*");
//
//            }}
//        else {
//            System.out.println("The number you entered is greater than 30");
//        }
//
//    }

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number five times(1 - 30): ");
    System.out.println("Enter a number: ");
    int firstNumber = scan.nextInt();
    System.out.println("Enter a number: ");
    int secondNumber = scan.nextInt();
    System.out.println("Enter a number: ");
    int thirdNumber = scan.nextInt();
    System.out.println("Enter a number: ");
    int fourthNumber = scan.nextInt();
    System.out.println("Enter a number: ");
    int fifthNumber = scan.nextInt();


    for(int count = 0; count < firstNumber; count++){
        System.out.print("*");
    }
    System.out.println();
    for(int count = 0; count < secondNumber; count++){
        System.out.print("*");
    }
    System.out.println();
    for(int count = 0; count < thirdNumber; count++){
        System.out.print("*");
    }
    System.out.println();
    for(int count = 0; count < fourthNumber; count++){
        System.out.print("*");
    }
    System.out.println();
    for(int count = 0; count < fifthNumber; count++){
        System.out.print("*");
    }



}

    public static void main(String[] args) {
        chart();
    }
}
