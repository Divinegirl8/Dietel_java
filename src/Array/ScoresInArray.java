package Array;

import java.util.Scanner;

public class ScoresInArray {
    public static void main(String[] args) {
        System.out.println(arrayLargeNumber(10));

    }

    public static int arrayLargeNumber(int integer){
        Scanner scan = new Scanner(System.in);

        int[] scores = new int[integer];

        int count;
        int largest = 0;
        for (count = 0; count < scores.length; count++){
            System.out.print("Enter score: ");
            int score = scan.nextInt();

            scores[count]  = score;
        }

        for (int number: scores){
            if (number > largest){
                largest = number;
            }
        }

        return largest;
    }
}
