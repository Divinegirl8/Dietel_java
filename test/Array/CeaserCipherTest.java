package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.CeaserCipher.*;

class CeaserCipherTest {
@Test
    void testEncryptWord(){
    assertEquals("ebiil",encryptWord("hello"));
    assertEquals("afsfkb",encryptWord("divine"));
    assertEquals("Irzhv",encryptWord("Lucky"));
    assertEquals("cofbka",encryptWord("friend"));
    assertEquals("DLXQ",encryptWord("GOAT"));

}

@Test
    void testDecryptWord(){
    assertEquals("hello",decryptWord(encryptWord("hello")));
    assertEquals("divine",decryptWord(encryptWord("divine")));
    assertEquals("lucky",decryptWord(encryptWord("lucky")));
}
}