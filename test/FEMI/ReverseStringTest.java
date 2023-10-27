package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static FEMI.reverseString.*;

class ReverseStringTest {

    @Test

    void testOne(){
        String input = "We outside";
        String result = "ew edistuo ";
        assertEquals(result,displayWord(reverseWord(input)));
    }

    @Test

    void testTwo(){
        String input = "Mr Femi is SO TRoublesome";
        String result = "rm imef si os emoselbuort ";
        assertEquals(result,displayWord(reverseWord(input)));
    }



}