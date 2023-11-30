package diaryApp;

import diaryApp.exception.DiaryNotFoundError;
import diaryApp.exception.UserNameExistError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {
    Diaries diaries;
    @BeforeEach

    void setUp(){
        diaries = new Diaries();

    }

    @Test void testThatMyDiariesCanAdd(){
        diaries.add("username","password");
        assertEquals(1,diaries.getSizeOfDiaries());
    }

    @Test void testThatMyDiariesCanFindDiaryByUserName(){
        diaries.add("username","password");
        diaries.add("username2","password2");
        diaries.add("Sharon","password3");

        assertEquals(3,diaries.getSizeOfDiaries());

        Diary diary = diaries.findDiaryByUserName("username");
        assertEquals("username",  diary.getUsername());

        Diary diary2 = diaries.findDiaryByUserName("username2");
        assertEquals("username2",diary2.getUsername());

        Diary diary3 = diaries.findDiaryByUserName("Sharon");
        assertEquals("Sharon",diary3.getUsername());
    }

    @Test void testThatMyDiariesCanThrowAnExceptionIfUserNameIsNotFound() {
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        diaries.add("Sharon", "password3");

        assertEquals(3, diaries.getSizeOfDiaries());

        assertThrows(DiaryNotFoundError.class, () ->diaries.findDiaryByUserName("Steph").getUsername());
    }

    @Test void testThatMyDiariesCanThrowAnExceptionIfUserNameAlreadyExist() {
        diaries.add("username", "password");

        assertThrows(UserNameExistError.class, () -> diaries.add("username", "password2"));
    }


@Test void testThatMyDiariesCanDelete(){
        diaries.add("joy","1234");
        diaries.add("philip","0000");

        assertEquals(2,diaries.getSizeOfDiaries());

        diaries.deleteDiary("joy","1234");
        assertEquals(1,diaries.getSizeOfDiaries());
}

    @Test void testThatMyDiariesCanThrowException(){
        diaries.add("joy","1234");
        diaries.add("philip","0000");

        assertEquals(2,diaries.getSizeOfDiaries());


       assertThrows(DiaryNotFoundError.class, () -> diaries.deleteDiary("odim","1234"));

    }
}