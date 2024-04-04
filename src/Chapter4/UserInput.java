package Chapter4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int count = 0;
        int pass = 0;
        int fail = 0;

        while ( count < 10) {

            System.out.println("Enter student score (pass = 1 and fail = 2): ");
            int score = scan.nextInt();

            if (score == 1) {
                pass += 1;
                count += 1;
            }
            if (score == 2) {
                fail += 1;
                count += 1 ;
            }

        }

        System.out.println("The number of student that passed is " + pass);
        System.out.println("The number of student that failed is " + fail);

        if (pass > 8) {
            System.out.println("Bonus to the instructor");
        }

    }
}
