package Chapter6;
import java.security.SecureRandom;
import java.util.Scanner;

import static Chapter6.ModifyStudentFatigue.loading;
import static Chapter6.StudentFatigue.*;

public class ArithmeticProblem {
    public static void subtractionLevelOne() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countCorrect = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = generateNumber();
            int number2 = generateNumber();
            System.out.println("How much is " + number1 + " - " + number2 + "?");
            int convertNumber = scanner.nextInt();




            if (convertNumber == (number1 - number2)) {
                System.out.println(generateCorrect());
                countCorrect++;
            } else {
                System.out.println("wrong");
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
        subtractionLevelOne();}

    public static int generateIntegers(){
        SecureRandom random = new SecureRandom();

        return random.nextInt(10,100);
    }

    public static void subtractionLevelTwo() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countCorrect = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = generateIntegers();
            int number2 = generateIntegers();
            System.out.println("How much is " + number1 + " - " + number2 + "?");
            String value = scanner.nextLine();
            ;

               int convertNumber = Integer.parseInt(value);

            if (convertNumber == (number1 - number2)) {
                System.out.println(generateCorrect());
                countCorrect++;
            } else {
                System.out.println("wrong");
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
        subtractionLevelTwo();}


    public static void subtraction() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Choose a level:
                level 1
                level 2
                """);
        String level = scanner.nextLine();

        while (!level.matches("\\d+")){
            System.out.println("Error!!!, input must contain numbers only \nEnter again");
            level = scanner.nextLine();
        }

        int convertLevel = Integer.parseInt(level);

        if (convertLevel == 1){
            System.out.println("you chose level 1");
            loading2();
            subtractionLevelOne();
        }

        else if (convertLevel == 2){
            System.out.println("you chose level 2");
            loading2();
            subtractionLevelTwo();
        }
        else {
            System.out.println("Error chose between 1 or 2");
            subtraction();
        }
    }
    public static void loading2() throws InterruptedException {
        String value = "........................";

        System.out.print("Loading Game");
        for (int index = 0; index < value.length(); index++) {
            System.out.print(value.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
    }

    public static void divisionLevelOne() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countCorrect = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = generateNumber();
            int number2 = generateNumber();
            System.out.println("How much is " + number1 + " / " + number2 + "?");
            int convertNumber = scanner.nextInt();




            if (convertNumber == (number1 / number2)) {
                System.out.println(generateCorrect());
                countCorrect++;
            } else {
                System.out.println("wrong");
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
        subtractionLevelOne();}


    public static void divisionLevelTwo() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int countCorrect = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = generateIntegers();
            int number2 = generateIntegers();
            System.out.println("How much is " + number1 + " / " + number2 + "?");
            String value = scanner.nextLine();
            ;

            int convertNumber = Integer.parseInt(value);

            if (convertNumber == (number1 / number2)) {
                System.out.println(generateCorrect());
                countCorrect++;
            } else {
                System.out.println("wrong");
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
        divisionLevelTwo();}


    public static void division() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Choose a level:
                level 1
                level 2
                """);
        String level = scanner.nextLine();

        while (!level.matches("\\d+")){
            System.out.println("Error!!!, input must contain numbers only \nEnter again");
            level = scanner.nextLine();
        }

        int convertLevel = Integer.parseInt(level);

        if (convertLevel == 1){
            System.out.println("you chose level 1");
            loading2();
            divisionLevelOne();
        }

        else if (convertLevel == 2){
            System.out.println("you chose level 2");
            loading2();
            divisionLevelOne();
        }
        else {
            System.out.println("Error chose between 1 or 2");
            division();
        }
    }


}
