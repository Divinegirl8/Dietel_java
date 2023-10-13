package Chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter4.Encryption.encryption;

class EncryptionTest {

    @Test
    void testEncryption(){
        assertEquals("0189",encryption("1234"));
        assertEquals("1101",encryption("3444"));
    }


}