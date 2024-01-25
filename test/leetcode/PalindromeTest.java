package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test void testOne(){
        int x = 121;
        assertTrue(Palindrome.isPalindrome(x));
    }

    @Test void testTwo(){
        int x = -121;
        assertFalse(Palindrome.isPalindrome(x));
    }

    @Test void testThree(){
        int x = 10;
        assertFalse(Palindrome.isPalindrome(x));
    }

}