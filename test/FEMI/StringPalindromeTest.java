package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.StringPalindrome.*;

class StringPalindromeTest {
    @Test

    void isPalindromeTest(){
        assertTrue(isStringPalindrome("Dad"));
        assertFalse(isStringPalindrome("Grace"));
        assertTrue(isStringPalindrome("Anna"));
        assertTrue(isStringPalindrome("--1--"));
        assertTrue(isStringPalindrome("nooN"));
        assertTrue(isStringPalindrome("NooN"));
        assertTrue(isStringPalindrome("noon"));
        assertTrue(isStringPalindrome("mOM"));
        assertTrue(isStringPalindrome("ANNa"));

    }



}