package Chapter6;

import java.util.Scanner;

public class RoundingNumbers1 {
    public static void roundNumber(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (scan.hasNextDouble()){
        double number = scan.nextDouble();


        double y = Math.floor(number + 0.5);

        System.out.println("The original value is " + number + "\n" + "The new value is " + y);}

        else {
            System.out.println("error");
        }
    }
}
