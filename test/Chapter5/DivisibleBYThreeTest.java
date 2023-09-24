package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleBYThreeTest {

    @Test

    public void testDivisibleByThree(){
        int function = DivisibleBYThree.number(30);
        assertEquals(165,function);
    }

    @Test

    public void testDivisibleByThreeTwo(){
        int function = DivisibleBYThree.number(10);
        assertEquals(18,function);
    }

    @Test

    public void testDivisibleByThreeThree(){
        int function = DivisibleBYThree.number(-10);
        assertEquals(0,function);
    }

}