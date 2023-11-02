package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.GreatestCommonDivisor.*;

class GreatestCommonDivisorTest {
@Test
    void testOne(){
    assertEquals(6,gcd(48,18));
    assertEquals(1,gcd(48,13));
}
}