package bankApp.exceptions;

public class LowAmountError extends IllegalArgumentException {
    public LowAmountError(String message) {super(message);}
}