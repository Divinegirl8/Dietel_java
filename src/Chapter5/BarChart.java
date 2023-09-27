package Chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarChart {
public static void chart() {
    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[5];


    for (int count = 0; count < numbers.length; count++){
        System.out.print("Enter Number: ");
        int user = scan.nextInt();
        numbers[count] = user;
    }

    for (int integers: numbers){
        for (int counted = 0; counted < integers; counted++){
        System.out.print("*");

    }
        System.out.println();}

}
    public static void main(String[] args) {
        chart();
    }
}
