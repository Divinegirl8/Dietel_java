package FEMI;

import org.junit.jupiter.api.Test;
import static FEMI.Anagram.anagram;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test

    void testAnagram(){
        assertTrue(anagram("love","evol"));
        assertTrue(anagram("silent","listen"));
        assertTrue(anagram("9-9y", "y9-9"));
        assertFalse(anagram("very","rey"));
        assertTrue(anagram("--1101--","--0111--"));
    }

}