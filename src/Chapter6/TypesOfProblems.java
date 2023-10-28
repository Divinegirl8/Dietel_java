package Chapter6;
import java.util.Scanner;

import static Chapter6.ModifyStudentFatigue.loading;
import static Chapter6.StudentFatigue.*;
import static Chapter6.DifficultyLevel.*;
import static Chapter6.ArithmeticProblem.*;
import static Chapter6.TypesOfProblems.*;

public class TypesOfProblems {
    public static void displayMethod() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                pick a type of arithmetic problem to study
                select 1 for Multiplication
                select 2 for Subtraction
                select 3 for Division
                select 4 for Addition
                select 5 for Mixture of the Arithmetic Operation
                """);
        String value = scanner.nextLine();
        while (!value.matches("\\d+")){
            System.out.println("Error!!!, input must contain numbers only \nEnter again");
            value = scanner.nextLine();
        }

        int convert = Integer.parseInt(value);
        if (convert == 1){
            levelValue();
        }

        else if (convert == 2){
            subtraction();
        }
        else if (convert == 3){
            division();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        displayMethod();
    }
}
