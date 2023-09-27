package phase;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(count < 10){
            System.out.print("Enter Score: ");
            int score = scan.nextInt();
            count ++;
            if (score % 2 == 0){
            sum += score;
            }
        }
        System.out.print("The sum of scores that is even is "+ sum);
    }
}
