package Array;

import static Function.Function.*;

import java.util.Scanner;

public class ArrayScoresTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[10];


        for (int count = 0; count < scores.length; count++) {
            System.out.println("Enter score " + (count + 1) + ": ");
            scores[count] = scan.nextInt();

        }

        int max = arrayMaxNumber(scores);
        int min = minNumber(scores);
        int summation = sumInt(scores);
        double average = averageArray(scores);


        System.out.printf("The total of the scores inputted is %d%nThe maximum number is %d%nThe minimum number is %d%nThe Average score is %.1f",summation,max,min,average);



    }
}
