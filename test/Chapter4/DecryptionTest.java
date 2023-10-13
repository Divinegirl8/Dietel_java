package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter4.Decryption.decryption;

class DecryptionTest {

    @Test
    void testDecryption(){
        assertEquals("1234",decryption("0189"));
        assertEquals("3444",decryption("1101"));
    }

}