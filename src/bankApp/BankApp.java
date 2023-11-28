package bankApp;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankApp {
   static Bank myBank = new Bank("Oceanic Bank");
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
        } else if (type.equals(BigDecimal.class)){
            object = type.cast(scanner.nextBigDecimal());
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
     press 4 -> Check Balance
     press 5 -> Transfer
     press 6 -> Exit
    ================================
              """);
      String userInput =  input(String.class);
        switch (userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> checkBalance();
            case "5" -> transfer();
            case "6" -> System.exit(0);
            default -> {print("wrong input, choose between 1 - 8");mainMenu();}
        }
    }



    private static void transfer() {
        print("Enter Sender Account Number: ");
        String senderNumber = input(String.class);
        print("Enter Receiver Account Number: ");
        String receiverNumber = input(String.class);
        print("Enter amount to transfer: ");
        BigDecimal amount = input(BigDecimal.class);
        print("Enter account pin");
        String pin = input(String.class);

        try {
            myBank.transfer(amount,senderNumber,receiverNumber,pin);
            System.out.println(myBank.findCustomerAccountNumber(senderNumber));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void checkBalance() {
        print("Enter your account number: ");
        String accountNumber = input(String.class);

        print("Enter pin");
        String pin = input(String.class);

        try {
            myBank.checkBalance(accountNumber,pin);
            System.out.println(myBank.findCustomerAccountNumber(accountNumber));
            mainMenu();
        } catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }


    private static void withdraw() {
        print("Enter your account number: ");
        String accountNumber = input(String.class);
        print("Enter amount to withdraw: ");
        BigDecimal amount = input(BigDecimal.class);
        print("Enter pin");
        String pin = input(String.class);

        try {
            myBank.withDraw(amount,accountNumber,pin);
            System.out.println(myBank.findCustomerAccountNumber(accountNumber));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }

    }

    private static void deposit() {
        print("Enter your account number: ");
        String accountNumber = input(String.class);
        print("Enter amount to deposit ");
        BigDecimal amount = input(BigDecimal.class);

        try{
            myBank.deposit(amount, accountNumber);
            System.out.println(myBank.findCustomerAccountNumber(accountNumber));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void createAccount() {
        print("First Name: ");
        String firstName = input(String.class);

        print("Last Name: ");
        String lastName = input(String.class);

        print("Create Password");
        String password = input(String.class);

        Account account = myBank.createAccount(firstName,lastName,password);
        System.out.println(account);
        mainMenu();
    }



    public static void main(String[] args) {
        mainMenu();
    }
}
