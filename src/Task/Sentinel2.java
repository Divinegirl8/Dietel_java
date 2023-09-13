package Task;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grades and quit with -8: ");
        double grade = scan.nextDouble();

         double total = 0;
         double sum = 0;




        for ( int number = 1; grade != -8; number ++) {


          total += 1;

          sum += grade;

            System.out.print("Enter grades and quit with -8: ");
            grade = scan.nextInt();


        }


           System.out.printf("The sum of the grade is %.0f and the average of the grades entered is %.2f" , sum , sum/total);




    }


}
