package diaryApp;

import diaryApp.exception.DiaryLockExceptions;
import diaryApp.exception.EntryNotFoundError;
import diaryApp.exception.InvalidPasswordError;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final String username;
    private final String password;
    private boolean isLocked = true;
    private List<Entry> entries;

    private int entrySize;


public Diary(String username, String password){
    this.username = username;
    this.password = password;
    entries = new ArrayList<>();

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

    public void createEntry(String title, String body) {
    if (isLocked) throw new DiaryLockExceptions("Cannot create entry because diary is locked");
    entrySize++;
    Entry entry = new Entry(generateEntryId(),title,body);
    entry.setDateCreated(LocalDateTime.now());
    entries.add(entry);
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
    if (isLocked) throw new DiaryLockExceptions("Cannot find entry because diary is locked");

    for (Entry entry : entries){
        if (entry.getId() == id) return entry;
    }
 throw new EntryNotFoundError("Entry id not found");
    }

    public void updateEntry(int id, String title, String body) {
    if (isLocked) throw new DiaryLockExceptions("Cannot update entry because diary is locked");
    Entry entry = findEntryId(id);
    entry.editEntry(title,body);
    entries.set(findIndexOf(id),entry);
    }

    public int findIndexOf(int id) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getId() == id) return index;
        }
        throw new EntryNotFoundError("Entry id not found");
    }

    public String getUsername(){
    return username;
    }

    public String getPassword(){
    return password;
    }
}
