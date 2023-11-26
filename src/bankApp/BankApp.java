package bankApp;

import java.util.Scanner;

public class BankApp {
    private static void print(String message) {
        System.out.println(message);
    }

    private static <E> E input(Class<E> type) {
        Scanner scanner = new Scanner(System.in);
        E object = null;

        if (type.equals(Integer.class)) {
            object = type.cast(scanner.nextInt());
        } else if (type.equals(String.class)) {
            object = type.cast(scanner.nextLine());
        } else if (type.equals(Double.class)) {
            object = type.cast(scanner.nextDouble());
        } else if (type.equals(Long.class)) {
            object = type.cast(scanner.nextLong());
        }

        return object;
    }

    public static void mainMenu(){
        print("""
    ================================
            Oceanic Bank
    ================================
     press 1 -> Create Account
     press 2 -> Deposit
     press 3 -> Withdraw
     press 4 -> Find Account
     press 5 -> Check Balance
     press 6 -> Transfer
     press 7 -> Close Account
     press 8 -> Exit
              """);
      String userInput =  input(String.class);
        switch (userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> findAccount();
            case "5" -> checkBalance();
            case "6" -> transfer();
            case "7" -> closeAccount();
            case "8" -> System.exit(0);
            default -> {print("wrong input, choose between 1 - 8");mainMenu();}
        }
    }

    private static void closeAccount() {
    }

    private static void transfer() {
    }

    private static void checkBalance() {
    }

    private static void findAccount() {
    }

    private static void withdraw() {
    }

    private static void deposit() {
    }

    private static void createAccount() {
        Bank myBank = new Bank("Oceanic Bank");
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
