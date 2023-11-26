package diaryApp.exception;

public class DiaryNotFoundError extends RuntimeException{
    public DiaryNotFoundError(String message){
        super(message);
    }
}
