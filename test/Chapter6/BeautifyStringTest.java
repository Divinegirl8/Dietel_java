package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.BeautifyString.*;

class BeautifyStringTest {
    @Test

    void testHasNoFullStop(){
        assertEquals("Graceful God.",beautifyFullStop("Graceful God"));
    }

    @Test

    void testHasFullStop(){
        assertEquals("Graceful God.",beautifyFullStop("Graceful God."));
    }

    @Test

    void testHasNoCapitalLetter(){
        assertEquals("Over",beautifyFirstLetter("over"));
    }

    @Test

    void testHasCapitalLetter(){
        assertEquals("Over",beautifyFirstLetter("Over"));
    }

    @Test

    void testHasCapitalLetterAndFullStop(){
        assertEquals("Beautiful God.",beautifyFullstopAndCapital("Beautiful God."));
    }

    @Test

    void testHasNoCapitalLetterAndFullStop(){
        assertEquals("Beautiful God.",beautifyFullstopAndCapital("beautiful God"));
    }




}