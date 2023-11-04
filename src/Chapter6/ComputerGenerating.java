package Chapter6;



import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;
import javax.swing.*;

public class ComputerGenerating {
    public static int generateNumber()  {
        SecureRandom random = new SecureRandom();
        return random.nextInt(9);
    }






    public static void displayInformation() {
        Scanner scanner = new Scanner(System.in);
        int number1 = generateNumber();
        int number2 = generateNumber();



        String value =  JOptionPane.showInputDialog("How much is " + number1 + " times " + number2 + "?");


        int convertNumber = getConvertNumber(value, scanner, number1, number2);


        if (convertNumber == (number1 * number2)) {
            JOptionPane.showMessageDialog(null,"Very good");
        }

        displayInformation();
    }

    private static int getConvertNumber(String value, Scanner scanner, int number1, int number2) {
        while (!value.matches("\\d+")) {
            value =  JOptionPane.showInputDialog(null,"Error!!!, input must contain numbers only \nEnter again");

        }

        int convertNumber = Integer.parseInt(value);

        while (convertNumber != (number1 * number2)) {
            String input = JOptionPane.showInputDialog(null,"No please try again: ");

            while (!input.matches("\\d+")) {
                input = JOptionPane.showInputDialog(null,"Error!!!, input must contain numbers only \nEnter again");

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