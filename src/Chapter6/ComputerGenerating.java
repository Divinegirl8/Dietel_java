package Chapter6;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerGenerating {
    public static int generateNumber()  {
        SecureRandom random = new SecureRandom();
        return random.nextInt(9);
    }






    public static void displayInformation() {
        Scanner scanner = new Scanner(System.in);
        int number1 = generateNumber();
        int number2 = generateNumber();



            System.out.println("How much is " + number1 + " times " + number2 + "?");
            String value = scanner.nextLine();


        int convertNumber = getConvertNumber(value, scanner, number1, number2);


        if (convertNumber == (number1 * number2)) {
                System.out.println("Very good");
            }

        displayInformation();
    }

    private static int getConvertNumber(String value, Scanner scanner, int number1, int number2) {
        while (!value.matches("\\d+")) {
            System.out.println("Error!!!, input must contain numbers only \nEnter again");
            value = scanner.nextLine();
        }

        int convertNumber = Integer.parseInt(value);

        while (convertNumber != (number1 * number2)) {
            System.out.println("No please try again: ");
            String input = scanner.nextLine();
            while (!input.matches("\\d+")) {
                System.out.println("Error!!!, input must contain numbers only \nEnter again");
                input = scanner.nextLine();
            }
            if (input.matches("\\d+")) {
                convertNumber = Integer.parseInt(input);
            }
        }
        return convertNumber;
    }

    public static void main(String[] args) {
        displayInformation();
    }
}
