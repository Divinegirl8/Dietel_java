package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestRateTest {

    @Test
    public void interestRateTest() {
        double function = Function.interestCalculation(5,10,1000);
        assertEquals(1628.89,function);
    }
    @Test
    public void interestRateTestTwo() {
        double function = Function.interestCalculation(20,2,2000);
        assertEquals(2880,function);
    }


}