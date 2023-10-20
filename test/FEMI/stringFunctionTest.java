package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.stringFunction.*;

class stringFunctionTest {
    @Test
    void testStringPalindrome(){
        assertTrue(isPalindromeValue("mom"));
        assertTrue(isPalindromeValue("mallam"));
        assertFalse(isPalindromeValue("james"));
    }

    @Test

    void testAnagram(){


        assertFalse(anagram("1001","1002"));
        assertFalse(anagram("ada", "dan"));
        assertTrue(anagram("mary","arym"));
        assertTrue(anagram("live","evli"));
        assertTrue(anagram("love","evlo"));
        assertTrue(anagram("--1101--","--0111--"));
        assertTrue(anagram("9900","0099"));
        assertFalse(anagram("live","love"));




    }

}