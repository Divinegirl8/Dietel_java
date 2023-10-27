package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.PerfectNumbers.*;

class PerfectNumbersTest {
   @Test
    void testPerfectNUmber(){
       assertTrue(isPerfectNumber(6));
   }
}