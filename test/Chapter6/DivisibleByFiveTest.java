package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.DivisibleByFive.*;

class DivisibleByFiveTest {
@Test
    void testOne(){
    assertTrue(divisibleByFive(5));
    assertFalse(divisibleByFive(3));
}
}