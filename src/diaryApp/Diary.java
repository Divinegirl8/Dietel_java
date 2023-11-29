package diaryApp;

import diaryApp.exception.DiaryLockExceptions;
import diaryApp.exception.EmptyInputError;
import diaryApp.exception.EntryNotFoundError;
import diaryApp.exception.InvalidPasswordError;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final String username;
    private final String password;
    private boolean isLocked = true;
    private List<Entry> entries;

    private List<Diary> diaries;

    private int entrySize;



public Diary(String username, String password){
    this.username = username;
    this.password = password;
    entries = new ArrayList<>();
    diaries = new ArrayList<>();


}

    public void unlockDiary(String userPassword) {
        validatePassword(userPassword);
        isLocked = false;
    }

    public void validatePassword(String userPassword) {
    if (!this.password.equals(userPassword)) throw new InvalidPasswordError("Invalid Password");
    }

    public boolean isLocked() {
    return isLocked;
    }

    public void lockDiary() {
    isLocked = true;
    }

    public Entry createEntry(String title, String body) {
    diaryIsLockedError();
    emptyInputError(title,body);
    entrySize++;
    Entry entry = new Entry(generateEntryId(),title,body);
    entry.setDateCreated(LocalDateTime.now());
    entries.add(entry);

    return entry;
    }

    public void emptyInputError(String title,String body){
        if(title.trim().isEmpty() || body.trim().isEmpty()) throw new EmptyInputError("Input cannot be empty");
    }

    public void diaryIsLockedError(){
        if (isLocked) throw new DiaryLockExceptions("Diary is locked");
    }

    public void addDiary(Diary diary) {
        diaries.add(diary);
    }

    public String generateTime() {
        return  LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    public int generateEntryId(){
    return Integer.parseInt( 19 + "" + entrySize);
    }

    public int getEntrySize() {
        return entries.size();
    }

    public void deleteEntry(int id) {
      entries.remove(findEntryId(id));


    }
    public Entry findEntryId(int id){
    diaryIsLockedError();

    for (Entry entry : entries){
        if (entry.getId() == id) return entry;
    } throw new EntryNotFoundError("Entry id not found");
    }

    public void updateEntry(int id, String title, String body) {
    diaryIsLockedError();
    emptyInputError(title,body);

    Entry entry = findEntryId(id);
    String message = entry.getBody() + " " + body;
    entry.setTitle(title);
    entry.setBody(message);
    
    }



    public String getUsername(){
    return username;
    }

    public String getPassword(){
    return password;
    }




}
