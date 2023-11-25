package bankApp;

import bankApp.exceptions.AccountNotFound;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private String name;
    private int countAccountGenerated = 1;
    private ArrayList<Account> accounts;

    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }


    public Account createAccount(String firstName, String lastName, String pin) {
        String customersName = customerFullName(firstName,lastName);
        String generateAccountNumber = generateAccountNumber();
        Account account = new Account(customersName,pin,generateAccountNumber);
        accounts.add(account);
        ++countAccountGenerated;
        return account;
    }

    private String customerFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    private String generateAccountNumber(){
        String prefix = "1013";
        return prefix + "" + countAccountGenerated;
    }


    public int getNumberOfAccountCreated() {
        return accounts.size();
    }

public Account findCustomerAccountNumber(String accountNumber){
        for (Account acct : accounts){
            if (acct.getNumber().equals(accountNumber)) return acct;
            }
        throw new AccountNotFound(accountNumber + " not found");
}

    public void deposit(BigDecimal amount, String accountNumber) {
        Account number = findCustomerAccountNumber(accountNumber);
        number.deposit(amount);
    }


    public BigDecimal checkBalance(String accountNumber, String pin) {
        Account number = findCustomerAccountNumber(accountNumber);
        return number.checkBalance(pin);
    }

    public void withDraw(BigDecimal amount, String accountNumber, String pin) {
        Account number = findCustomerAccountNumber(accountNumber);
        number.withdraw(amount,pin);
    }

    public void transfer(BigDecimal amount, String senderAcctNumber, String receiverAcctNumber, String senderPin) {
        Account senderNumber = findCustomerAccountNumber(senderAcctNumber);
        Account receiverNumber = findCustomerAccountNumber(receiverAcctNumber);
        senderNumber.withdraw(amount,senderPin);
        receiverNumber.deposit(amount);
    }

    public void removeAccount(String accountNumber, String pin1) {
        Account account = findCustomerAccountNumber(accountNumber);
        account.validatePin(pin1);
        accounts.remove(account);
    }



}
