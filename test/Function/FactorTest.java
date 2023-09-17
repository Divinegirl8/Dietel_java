package Function;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class FactorTest {

    @Test
    public void  testFactorOne() {
        int factor = Function.factorOf(10);
        assertEquals(4,factor);
    }


    @Test
    public void  testFactorTwo() {
        int factor = Function.factorOf(2);
        assertEquals(2,factor);
    }


    @Test
    public void  testFactorThree() {
        int factor = Function.factorOf(1);
        assertEquals(1,factor);
    }

}