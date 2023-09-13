package Task;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 + 7 is equals to ______");
        int result = scan.nextInt();

        System.out.println(result == 8? "Correct" : "Wrong");

    }


}
