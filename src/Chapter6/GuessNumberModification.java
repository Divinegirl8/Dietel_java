package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberModification {
    public static int randomNumberGenerator(){

        return new Random().nextInt(1,1001);
    }

    public static String promptUser(){
        return "Guess a number between 1 and 1000.";
    }

    public static String displayHigh(){
        return  "Too high. Try again.";
    }
    public static String displayLow(){
        return "Too low. Try again";
    }




    private final static String CORRECT = "Congratulations. You guessed the number!";
    private final static String WRONGINPUT = "Value must contain only positive numbers between 1 - 1000";



    private static void displayGame(Scanner scanner, int generateNumber, boolean option) {
        int count = 0;
        do {
            System.out.println(promptUser());
            String userInput = scanner.nextLine();

            while (!(userInput.matches("\\d+"))){
                System.out.println(WRONGINPUT);
                userInput = scanner.nextLine();
            }

            int convertToNumber = Integer.parseInt(userInput);

            if (convertToNumber == generateNumber){
                System.out.println(CORRECT);
            }
            else {
                   if (convertToNumber > generateNumber){
                System.out.println(displayHigh());}
                   else {
                       System.out.println(displayLow());
                   }
                ++count;
                continue;
            }

            option = isOption(scanner, option);

            System.out.println(countEntries(count));

        }while (option);
    }

    private static boolean isOption(Scanner scanner, boolean option) {
        System.out.println("do you want to continue");
        String answer = scanner.nextLine();

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Invalid input. Enter 'yes' or 'no'.");
            answer = scanner.nextLine().toLowerCase();
        }

        if (answer.equals("no")) option = false;
        return option;
    }



    private static final String goodEntriesMessage = "Aha! You know the secret";
    private static final String badEntriesMessage = "You should be able to do better!";

    public static String countEntries(int count){

        if (count > 10) return badEntriesMessage;

        return goodEntriesMessage;
    }
    public static void playGame(){
        boolean option = true;
        Scanner scanner = new Scanner(System.in);
        int generateNumber = randomNumberGenerator();

        displayGame(scanner, generateNumber, option);

    }


    public static void main(String[] args) {
        playGame();

    }

}
