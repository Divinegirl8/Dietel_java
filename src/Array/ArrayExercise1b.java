package Array;

import java.util.Scanner;

public class ArrayExercise1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      System.out.println("Enter Score: ");
        int score = scan.nextInt();

        int minimum = score;
        double total = 0;
        total += score;
        int maximum = 0;
        int count;

        for (count = 1; count < 10; count++){
            System.out.println("Enter Score: ");
            score = scan.nextInt();
            total += score;

            if(score > maximum){
                maximum = score;
            }
            if (score < minimum){
                minimum = score;
            }
        }

        System.out.printf("The total of the scores inputted is %.0f%nThe maximum number is %d%nThe minimum number is %d%nThe Average score is %.1f",total,maximum,minimum,total/count);

    }
}
