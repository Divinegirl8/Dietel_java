package diaryApp;

import diaryApp.exception.DiaryNotFoundError;
import diaryApp.exception.InvalidPasswordError;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password) {
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
