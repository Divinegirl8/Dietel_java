package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.Multiples.*;

class MultiplesTest {
    @Test

    void  testMultiples(){
        assertTrue(multiplesOf(125,5));
        assertFalse(multiplesOf(5,125));
        assertTrue(multiplesOf(9,3));
        assertFalse(multiplesOf(5,6));

    }

}