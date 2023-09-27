package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonetaryTest {

    @Test
    public void testMonetary(){
        String money = Function.monetaryInterestCalculator(1000,5,4,10);
        assertEquals("The compounded interest is $1643.61 cents",money);
    }

}