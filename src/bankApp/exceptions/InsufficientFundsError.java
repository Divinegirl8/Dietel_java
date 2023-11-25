package bankApp.exceptions;

public class InsufficientFundsError extends IllegalArgumentException{
    public InsufficientFundsError(String message) {super((message));}
}
