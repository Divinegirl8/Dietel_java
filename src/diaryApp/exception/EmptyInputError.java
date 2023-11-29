package diaryApp.exception;

public class EmptyInputError extends RuntimeException{
    public EmptyInputError(String message){
        super(message);
    }
}
