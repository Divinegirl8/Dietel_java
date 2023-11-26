package diaryApp.exception;

public class EntryNotFoundError extends RuntimeException {
    public EntryNotFoundError(String message){
        super(message);
    }
}
