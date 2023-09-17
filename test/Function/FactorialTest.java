package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialOfFive() {
        int factorial = Function.factorial(5);
        assertEquals(120,factorial);
    }

    @Test
    public void factorialOfThree() {
        int factorial = Function.factorial(3);
        assertEquals(6,factorial);
    }

    @Test
    public void factorialOfTen() {
        int factorial = Function.factorial(10);
        assertEquals(3628800,factorial);
    }

}