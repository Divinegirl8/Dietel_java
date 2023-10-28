package Chapter6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class StudentFatigue {
    public static String generateIncorrect(){
        Random random = new Random();
        int number = random.nextInt(1,4);

        String value = switch (number) {
            case 1 -> "No. Please try again.";
            case 2 -> "Wrong. Try once more.";
            case 3 -> "Don't give up!";
            case 4 -> "No. Keep trying.";
            default -> "";
        };

        return value;
    }

    public static String generateCorrect(){
        Random random = new Random();
        int number = random.nextInt(1,4);

        String value = switch (number) {
            case 1 -> "Very good!";
            case 2 -> "Excellent!";
            case 3 -> "Nice work!";
            case 4 -> "Keep up the good work!";
            default -> "";
        };

        return value;
    }


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
                System.out.println(generateCorrect());
            }

            displayInformation();
        }

        public static int getConvertNumber(String value, Scanner scanner, int number1, int number2) {
            while (!value.matches("\\d+")) {
                System.out.println("Error!!!, input must contain numbers only \nEnter again");
                value = scanner.nextLine();
            }

            int convertNumber = Integer.parseInt(value);

            while (convertNumber != (number1 * number2)) {
                System.out.println(generateIncorrect());
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
