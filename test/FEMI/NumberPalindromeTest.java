package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.NumberPalindrome.*;
class NumberPalindromeTest {
    @Test

    void testOne(){
        assertTrue(isNumberPalindrome("1001"));
        assertTrue(isNumberPalindrome("11111111111111111111111111"));
        assertFalse(isNumberPalindrome("abba"));
        assertFalse(isNumberPalindrome("1121"));
        assertFalse(isNumberPalindrome("NOON"));
    }


}