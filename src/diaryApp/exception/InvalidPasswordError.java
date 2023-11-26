package diaryApp.exception;

public class InvalidPasswordError extends RuntimeException{
    public  InvalidPasswordError(String message){
        super(message);
    }
}
