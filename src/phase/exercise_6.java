package phase;

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        String pickoff =  " ";

        while (count < 10){
            System.out.print("Enter Score: ");
            count += 1;
          int score = scan.nextInt();
            String extract = String.valueOf(score);
            pickoff += extract + " ";

        }
        System.out.println("you entered the following scores" + pickoff);
    }
}
