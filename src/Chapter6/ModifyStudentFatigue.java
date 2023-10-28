package Chapter6;
import java.util.Scanner;

import static Chapter6.StudentFatigue.*;

public class ModifyStudentFatigue {
    public static void displayInformation() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countCorrect = 0;
        int countIncorrect = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = generateNumber();
            int number2 = generateNumber();
            System.out.println("How much is " + number1 + " times " + number2 + "?");
            String value = scanner.nextLine();

            int convertNumber = 0;

            while (!value.matches("\\d+")) {
                System.out.println("Error!!!, input must contain numbers only \nEnter again");
                value = scanner.nextLine();
            }
            if (value.matches("\\d+")) {
                convertNumber = Integer.parseInt(value);
            };

            if (convertNumber == (number1 * number2)) {
                System.out.println(generateCorrect());
                countCorrect++;
            } else {
                System.out.println("wrong");
                countIncorrect++;
            }
        }

        if (countCorrect > 7){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println();
        loading();
        displayInformation();
    }


    public static void loading() throws InterruptedException {
        String value = "........................";

        System.out.print("Loading new game");
        for (int index = 0; index < value.length(); index++) {
            System.out.print(value.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
    }
    public static void main(String[] args) throws InterruptedException {
        displayInformation();
    }
}
