package Task;

import java.util.Scanner;

public class Number {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a number: ");

        int userNumber = scan.nextInt();

//        int squareNumber = (int) Math.sqrt(userNumber);
        int squareNumber = userNumber * userNumber;

//        System.out.printf("The square of %d is %d%n" , userNumber,squareNumber);

        System.out.println("The square of " + userNumber + " is " + squareNumber);



    }
}
