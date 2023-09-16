package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    public void testFunctionLessThanFiftyRange() {

        int rate = Function.Rate(45);
         assertEquals(12200,rate);
    }

    @Test
    public void testFunctionRangeFiftyTofiftyNine() {

        int rate = Function.Rate(50);
        assertEquals(15000,rate);

    }

    @Test
    public void testFunctionRangeSixtytoSixtyNine() {
        int rate = Function.Rate(64);
        assertEquals(21000,rate);
    }

    @Test
    public void testFunctionGreaterThanAndEqualsToSeventyRange(){
        int rate = Function.Rate(89);
        assertEquals(49500,rate);
    }

}