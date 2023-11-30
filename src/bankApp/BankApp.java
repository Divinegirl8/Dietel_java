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

    public static void mainMenu() throws InterruptedException {
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



    private static void transfer() throws InterruptedException {
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
            System.out.println("Account Balance: " + myBank.checkBalance(senderNumber,pin));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void checkBalance() throws InterruptedException {
        print("Enter your account number: ");
        String accountNumber = input(String.class);

        print("Enter pin");
        String pin = input(String.class);

        try {
            System.out.println("Account Balance: " + myBank.checkBalance(accountNumber, pin));
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
        String amount = input(String.class);

        while (!amount.matches("\\d+")){
            System.out.println("Amount should be a positive number only");
            amount = input(String.class);
        }

        BigDecimal convertAmount = BigDecimal.valueOf(Integer.parseInt(amount));

        print("Enter pin");
        String pin = input(String.class);

        try {
            myBank.withDraw(convertAmount,accountNumber,pin);
            System.out.println(myBank.findCustomerAccountNumber(accountNumber));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());withdraw();
        }

    }

    private static void deposit() throws InterruptedException {
        print("Enter your account number: ");
        String accountNumber = input(String.class);
        print("Enter amount to deposit ");
        String amount = input(String.class);

        while (!amount.matches("\\d+")){
            System.out.println("Amount should be a positive number only");
            amount = input(String.class);
        }

        BigDecimal convertAmount = BigDecimal.valueOf(Integer.parseInt(amount));

        try{
            myBank.deposit(convertAmount, accountNumber);
            System.out.println(myBank.findCustomerAccountNumber(accountNumber));
            mainMenu();
        }catch (Exception exception){
            print(exception.getMessage());
            mainMenu();
        }
    }

    private static void createAccount() throws InterruptedException {
        print("First Name: ");
        String firstName = input(String.class);

        while (!firstName.matches("[a-zA-Z]+")){
            System.out.println("Error!!! first name must consist of letters only with no space");
            firstName = input(String.class);
        }

        print("Last Name: ");
        String lastName = input(String.class);

        while (!lastName.matches("[a-zA-Z]+")){
            System.out.println("Error!!! last name must consist of letters only with no space");
            lastName = input(String.class);
        }


        print("Create Password");
        String password = input(String.class);

        while (password.length() < 6){
            System.out.println("password too weak!!!, the length of password must greater than 5");
            password = input(String.class);
        }

        Account account = myBank.createAccount(firstName,lastName,password);
        creating();
        System.out.println("Account created successfully");
        System.out.println("Account Number: " + account.getNumber());
        mainMenu();
    }

    private static void creating() throws InterruptedException {

        String symbol = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.print("Creating please hold on ");

        for (int index = 0; index < symbol.length();index++){
            System.out.print(symbol.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
    }



    public static void main(String[] args) throws InterruptedException {
        mainMenu();
    }
}
