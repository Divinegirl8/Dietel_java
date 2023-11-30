package diaryApp;

import diaryApp.exception.UserNameExistError;
import diaryApp.exception.DiaryNotFoundError;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries;

    public Diaries(){
diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        for (Diary diary : diaries){
            if (diary.getUsername().contains(username)) throw new UserNameExistError("Error!!! a user by that username already exists\nEnter again");
        }

        Diary diary = new Diary(username, password);
        diaries.add(diary);

    }

    public int getSizeOfDiaries() {
        return diaries.size();
    }

    public Diary findDiaryByUserName(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) return diary;
        }
        throw new DiaryNotFoundError("Diary does not exist");
    }

    public void deleteDiary(String userName, String password) {
        Diary diaryToRemove = null;

        for (Diary diary : diaries) {
            if (diary.getUsername().equals(userName) && diary.getPassword().equals(password)) {
                diaryToRemove = diary;
                break;
            }
        }

        if (diaryToRemove != null) {
            diaries.remove(diaryToRemove);
        } else {
            throw new DiaryNotFoundError("Diary does not exist");
        }
    }
}
