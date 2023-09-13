package Task;


import java.util.Scanner;


public class TotalFactors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scan.nextInt();

        int total = 0;

        for (int number1 = 1; number1 <= number; number1++){

            if(number % number1 == 0){
                total += 1;
            }
        }
        System.out.print(total);


        System.out.println();

        // using while loop


        System.out.print("Enter a number: ");

        int number1 = scan.nextInt();

        int total1 = 0;
        int count = 0;


        while (count <= number1) {
            count++;
            if(number1 % count == 0) {

                total1++;

            }

        }
        System.out.print(total1);


    }




}
