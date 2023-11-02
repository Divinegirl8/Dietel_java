package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.GuessNumberModification.*;

class GuessNumberModificationTest {

    @Test

    void testBadEntries(){
        String expected = "You should be able to do better!";
        assertEquals(expected,countEntries(11));
    }



    @Test

    void testGoodEntries(){
        String expected = "Aha! You know the secret";
        assertEquals(expected,countEntries(10));
    }

}