package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test

    public void testNumberIsPrime() {
        boolean number = Function.isPrime(11);
        assertTrue(number);

    }

    @Test
    public void testNumberIsNotPrime() {
        boolean number = Function.isPrime(20);
        assertFalse(number);
    }

}