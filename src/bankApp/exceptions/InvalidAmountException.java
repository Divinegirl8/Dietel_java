package bankApp.exceptions;

public class InvalidAmountException extends IllegalArgumentException{
    public InvalidAmountException(String message){super(message);}
}
