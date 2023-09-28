package phase;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while(count < 10){
            System.out.print("Enter Score: ");
            int score = scan.nextInt();
            sum += score;
            count ++;
        }
        System.out.print("The average of the scores is "+ sum/count);
    }
    }


