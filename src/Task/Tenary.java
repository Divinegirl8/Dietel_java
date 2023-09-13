package Task;

import java.util.Scanner;

public class Tenary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input grade :");

        int grade = scan.nextInt();

            System.out.printf("%s" , grade >= 60 ? "passed" : "failed");
        }

    }



