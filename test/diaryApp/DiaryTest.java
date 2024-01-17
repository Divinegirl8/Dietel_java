package diaryApp;

import diaryApp.exception.EmptyInputError;
import diaryApp.exception.InvalidPasswordError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach
    void setUp(){
        diary = new Diary("username","password");
    }

    @Test void testThatDiaryIsUnlocked(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test void testThatDiaryCanRaiseErrorIfPasswordIsNotCorrect(){
        assertThrows(InvalidPasswordError.class, ()-> diary.unlockDiary("pass"));
    }

    @Test void testThatDiaryCanBeLocked(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test void testThatMyDiaryCanCreateEntry(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        assertEquals(1, diary.getEntrySize());
        assertEquals(191,diary.generateEntryId());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test void testThatMyDiaryCanCreateMoreThanOneEntry(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        assertEquals(15,diary.getEntrySize());
        diary.lockDiary();
    }

    @Test void testThatMyEntryCanThrowAnErrorIfEmpty(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        assertThrows(EmptyInputError.class,()->  diary.createEntry(" "," "));


    }

    @Test void testThatMyDiaryCanDeleteEntry(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        assertEquals(1,diary.getEntrySize());
        assertEquals(191,diary.generateEntryId());

        diary.deleteEntry(191);
        assertEquals(0,diary.getEntrySize());

        diary.lockDiary();
        assertTrue(diary.isLocked());

    }

    @Test void testThatMyDiaryCanDeleteMoreThanOneEntries(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        assertEquals(191,diary.generateEntryId());

        diary.createEntry("title","body");
        assertEquals(192, diary.generateEntryId());

        diary.createEntry("title", "body");
        assertEquals(193, diary.generateEntryId());

        assertEquals(3,diary.getEntrySize());

        diary.deleteEntry(192);
        diary.deleteEntry(191);

        assertEquals(1,diary.getEntrySize());
        diary.lockDiary();
        assertTrue(diary.isLocked());

    }

    @Test void testThatMyDiaryWillThrowAnExceptionIfEntryIsNotFound(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        assertEquals(191,diary.generateEntryId());

        diary.deleteEntry(191);
        assertThrows(RuntimeException.class, ()-> diary.deleteEntry(191));

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test void testThatMyDiaryCanFindEntryById(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        diary.createEntry("title","body");
        Entry entry = diary.findEntryId(191);
        Entry entry2 = diary.findEntryId(192);
        assertEquals(191, entry.getId());
        assertEquals(192,entry2.getId());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test void testThatMyDiaryCanThrowExceptionIfIdIsNotFound(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        diary.createEntry("title","body");

        assertThrows(RuntimeException.class,()->  diary.findEntryId(190));


    }

    @Test void testThatDiaryCannotCreateEntryIfLocked(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        diary.createEntry("title","body");

        diary.lockDiary();

        assertThrows(RuntimeException.class,()-> diary.createEntry("title","body"));

    }

    @Test void testThatDiaryCannotDeleteEntryIfLocked(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());

        diary.createEntry("title","body");
        diary.createEntry("title","body");

        diary.lockDiary();

        assertThrows(RuntimeException.class,()-> diary.deleteEntry(192));

    }

    @Test void testThatDiaryCanUpdateAPreviousEntry(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");
        diary.createEntry("title","body");

        assertEquals(5,diary.getEntrySize());

        diary.updateEntry(193,"title","body");
        assertEquals(5,diary.getEntrySize());
        diary.updateEntry(192,"title","body");
        assertEquals(5,diary.getEntrySize());

        diary.lockDiary();

    }









}