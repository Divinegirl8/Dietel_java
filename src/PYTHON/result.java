package PYTHON;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);




        int count = 0;
        int pass = 0;
        int fail = 0;

        while (count < 10) {

            System.out.println("Enter score(pass = 1 and fail = 2): ");
            int score = scan.nextInt();

            if (score == 1) {
                pass +=1;
                count +=1;
            }
            if (score == 2) {
                fail +=1;
                count +=1;
            }

            if ( score != 1 || score != 2){
                continue;

            }


        }
        System.out.println("fail =" + fail);

    }
}

