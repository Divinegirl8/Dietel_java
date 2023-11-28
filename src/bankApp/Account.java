
package bankApp;

import bankApp.exceptions.InsufficientFundsError;
import bankApp.exceptions.InvalidDepositAmountException;
import bankApp.exceptions.InvalidPinException;
import bankApp.exceptions.LowAmountError;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;
    private final String name;
    private String pin;
    private  String number;

    public Account(String name, String pin, String number) {
        this.name = name;
        this.pin = pin;
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public BigDecimal checkBalance(String pin) {
      validatePin(pin);
        return balance;
    }

    public void deposit(BigDecimal amount){
        validateAmount(amount);

        if (balance == null) balance = BigDecimal.ZERO;
        balance = balance.add(amount);
    }

    public void validatePin(String pin){
        if (!pin.equals(this.pin)) throw new InvalidPinException("Pin is invalid");
    }

    public  void validateAmount(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new InvalidDepositAmountException("Error!!!, the amount you are trying to deposit must be greater than 0 \nTry again");
    }

    public void withdraw(BigDecimal amount, String pin){
        validatePin(pin);
        validateSufficientFund(amount);
        validateLowBalance(amount);

       balance = balance.subtract(amount);
    }

    public void validateSufficientFund(BigDecimal amount){
        if (balance == null) balance = BigDecimal.ZERO;
       if (this.balance.compareTo(amount)  < 0) throw new InsufficientFundsError("Error!!! your account balance is lower than the money you are trying to withdraw\nTry Again");
    }

    public void validateLowBalance(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) <= 0)  throw new LowAmountError("Error!!! The amount cannot be less than 0\nTry again");
    }

    public String toString(){
        return String.format("""
                ================================
                Account name: %s
                Account number: %s
                Balance: %s
                Account pin: Unavailable
                ================================
                """, name, number, balance);
    }
}

