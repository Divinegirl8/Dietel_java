package diaryApp.exception;

public class UserNameExistError extends RuntimeException{
    public UserNameExistError(String message){
        super(message);
    }
}
