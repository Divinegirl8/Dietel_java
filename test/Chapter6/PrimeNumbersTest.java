package Chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.PrimeNumbers.*;

class PrimeNumbersTest {
 @Test
    void testPrimeNumbers(){
     assertEquals(2,primeNumbers(2));
     assertEquals(11,primeNumbers(11));
     assertEquals(19,primeNumbers(19));
 }

 @Test
    void testNotPrimeNumbers(){
     assertEquals(0,primeNumbers(4));
     assertEquals(0,primeNumbers(105));
 }
}