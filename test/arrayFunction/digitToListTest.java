package arrayFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.digitToList;

class digitToListTest {

    @Test

    public void testOne() {
        assertEquals("[1,2,3,4,5,6,7,8,9,1]",digitToList(1234567891));
    }

    @Test
    public void testTwo() {
        assertEquals("[4,5]",digitToList(45));
    }

    @Test
    public void testThree() {
        assertEquals("[2]",digitToList(2));
    }

}