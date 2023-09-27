package phase;

import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count;
        for(count = 1;count <= 10;){
            System.out.print("Enter a number: ");
            int score = scan.nextInt();

            if (score > 0 && score <= 100){
                count += 1;
                sum += score;
            }


        }

        System.out.print("The sum of the valid score is " + sum);


    }
}
