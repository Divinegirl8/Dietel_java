package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.LeapYear.*;

class LeapYearTest {

    @Test
    void isLeapYearTest(){
        assertTrue(isLeap(2000));
        assertFalse(isLeap(1900));
        assertTrue(isLeap(2004));
    }

}