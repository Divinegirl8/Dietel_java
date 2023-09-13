package Task;

import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int number = 1; number <= 5; number++) {

            System.out.print("Enter number: ");
            int numbers = scan.nextInt();

            if(numbers < 0) {
                negative += 1;
            }

            if(numbers > 0) {
                positive += 1;
            }

            if(numbers == 0) {
                zero += 1;
            }


        }

        System.out.printf("The total of the positive number is %d%n " , positive);
        System.out.printf("The total of the negative number is %d%n " , negative);
        System.out.printf("The total of the zero number is %d%n " , zero);


    }

}
