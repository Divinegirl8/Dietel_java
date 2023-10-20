package FEMI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringToDigitTest {
    @Test
    void testOne(){
        String[] input = {"ABC21F", "13cpz", "A1L"};
       int expected = StringToDigit.checkString(input);
       assertEquals(5,expected);
    }

    @Test
    void testTwo(){
        String[] input = {"ABC21F", " 130cpz", "A1L"};
        int expected = StringToDigit.checkString(input);
        assertEquals(6,expected);
    }

    @Test
    void testThree(){
        String[] input = {"ABC21F", "-30cpz", "A1L"};
        int expected = StringToDigit.checkString(input);
        assertEquals(5,expected);
    }

}