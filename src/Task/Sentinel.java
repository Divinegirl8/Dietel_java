package Task;

import  java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grades and enter -1 to quit: ");
        double grades = scan.nextDouble();

        double total = 0;
        double gradeCounter = 0;
        double counter = 0;


      while(grades != -1) {
          counter++;
          total += grades;
          gradeCounter+=1;

          System.out.print("Enter grades and enter -2 to quit: ");
           grades = scan.nextDouble();

      }

      if (gradeCounter > 0) {
          double average = total / gradeCounter;

          System.out.printf("The total sum is %.0f and the average score of students is %.2f%n" , total , average);
      }
      else {
          System.out.println("no grades entered");
      }

    }

}
