package SnackTwo;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean yes = true;

        do {
            System.out.print("Enter first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scan.nextInt();

            int result = firstNumber + secondNumber;

            System.out.printf("%d + %d = %d%n", firstNumber,secondNumber,result);

            scan.nextLine();

            System.out.println("Do you want to continue?(enter yes or no)");
            String userResponse = scan.nextLine();

            if(userResponse.equals("no") || userResponse.equals("No") || userResponse.equals("NO")){
                yes = false;
            }
        }
        while (yes);



    }

}
