package PYTHON;

import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is your problem: ");
        String client = scanner.nextLine();

        System.out.print(" Have you had this problem before (yes or no)? ");
        String clientAnswer = scanner.nextLine();

        if (clientAnswer.equals("yes") || clientAnswer.equals("Yes") || clientAnswer.equals("YES")){
            System.out.println("Well, you have it again");
        }

        if (clientAnswer.equals("no") || clientAnswer.equals("No") || clientAnswer.equals("NO")){
            System.out.println("Well, you have it now");
        }


    }
}
