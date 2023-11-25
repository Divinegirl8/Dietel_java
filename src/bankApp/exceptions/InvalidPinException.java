package bankApp.exceptions;

public class InvalidPinException extends IllegalArgumentException{
    public InvalidPinException(String message){
        super(message);
    }
}
