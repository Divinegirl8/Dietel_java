package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.PalindromeNumber.*;

class PalindromeNumberTest {
    @Test
void testOne(){
        assertTrue(isPalindromeNumber(1111111111));
        assertTrue(isPalindromeNumber(1221));
        assertFalse(isPalindromeNumber(-111));
        assertTrue(isPalindromeNumber(12321));
        assertFalse(isPalindromeNumber(12563));
    }
}