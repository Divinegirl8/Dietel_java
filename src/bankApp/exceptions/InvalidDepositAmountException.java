package bankApp.exceptions;

public class InvalidDepositAmountException extends IllegalArgumentException{
    public InvalidDepositAmountException(String message){super(message);}
}
