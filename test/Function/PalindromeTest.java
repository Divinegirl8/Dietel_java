package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testIsPalindrome() {

        boolean result = Function.palindrome(12221);
        assertTrue(result);
    }

    @Test
    public void testIsNotPalindrome() {

        boolean result = Function.palindrome(12228);
        assertFalse(result);
    }

}