package Task;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis()/2 % 10);

        System.out.println(number1 + " + " + number2 + " is equals to _______");
        int result = scan.nextInt();
        System.out.printf("%d + %d is equals to %d is %b ", number1 ,  number2, result, number1 + number2 == result );


    }

}
