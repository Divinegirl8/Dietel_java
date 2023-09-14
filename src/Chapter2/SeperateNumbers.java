package Chapter2;

import java.util.Scanner;
public class SeperateNumbers {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers: ");

        int result = input.nextInt();


        int quotient = result/10000;
        int quotient2 = result/1000%10;
        int quotient3 = result/100%10;
        int quotient4 = result/10%10;
        int modula = result %10;







        if (result > 5) {

            System.out.printf("%d   %d   %d   %d   %d%n"  ,  quotient , quotient2 , quotient3 , quotient4 ,modula);

        }

        if (result < 5) {

            System.out.printf("%d   %d   %d   %d   %d%n"   , quotient , quotient2 , quotient3 , quotient4 ,modula);

        }


    }
}
