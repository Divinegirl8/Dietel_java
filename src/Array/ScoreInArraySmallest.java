package Array;

import java.util.Scanner;

public class ScoreInArraySmallest {

    public static void main(String[] args) {
        System.out.print(arraySmallNumber(10));
    }
    public static int arraySmallNumber(int integer){
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[integer];

        int count;
        int smallest = 0;

        for (count = 0; count < scores.length; count++){
            System.out.print("Enter score: ");
            int score = scan.nextInt();

            scores[count]  = score;
            smallest = scores[count];
        }


        for (int number: scores){
            if (number < smallest){
                smallest = number;
            }
        }

        return smallest;
    }
}
