package Chapter6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter6.TwoPoints.points;

class TwoPointsTest {
@Test
    void testOne(){
    assertEquals(3.1623,points(2,8,5,9));
}
}