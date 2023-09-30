package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.stringPalindrome;

class StringPalindromeTest {

    @Test

    public void testStringPalindrome() {
        assertTrue(stringPalindrome("mum"));
    }


    @Test
    public void testStringPalindromeTwo() {
        assertFalse(stringPalindrome("mummy"));
    }


    @Test
    public void testStringPalindromeThree() {
        assertFalse(stringPalindrome("gunners"));
    }

}