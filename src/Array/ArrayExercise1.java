package Array;

import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[10];

        int count;
        int minimum = scores.length;
        int maximum = 0;
        double total = 0;
        for (count = 0; count < scores.length; count++){
            System.out.print("Enter Score " + (count + 1) + ": ");
            scores[count] = scan.nextInt();

            total += scores[count];

            if (scores[count] > maximum){
                maximum = scores[count];
            }

            if(scores[count] < minimum){
                minimum = scores[count];
            }

        }

        System.out.printf("The total of the scores inputted is %.0f%nThe maximum number is %d%nThe minimum number is %d%nThe Average score is %.1f",total,maximum,minimum,total/count);

    }
}
