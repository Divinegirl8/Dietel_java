package phase;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(count < 10){
            System.out.print("Enter Score: ");
            int score = scan.nextInt();
            sum += score;
            count ++;
        }
        System.out.print("The sum of the scores is "+ sum);
    }
}
