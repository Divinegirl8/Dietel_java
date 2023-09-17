package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    public void testResultOne() {
        double result = Function.divide(5,8);
        assertEquals(0.63,result);
    }

    @Test
    public void testResultTwo() {
        double result = Function.divide(4,0);
        assertEquals(0,result);
    }

    @Test

    public void testResultThree() {

        double result = Function.divide(4,2);
        assertEquals(2,result);
    }

    @Test

    public void testResultFour() {

        double result = Function.divide(2,4);
        assertEquals(0.5,result);
    }

}