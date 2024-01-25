package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    @Test void testOne(){
        String s = "Hello World";
        assertEquals(5,LengthOfLastWord.lengthOfLastWord(s));
    }
    @Test void testTwo(){
        String s = "   fly me   to   the moon  ";
        assertEquals(4,LengthOfLastWord.lengthOfLastWord(s));
    }
    @Test void testThree(){
        String s = "luffy is still joyboy";
        assertEquals(6,LengthOfLastWord.lengthOfLastWord(s));
    }

}