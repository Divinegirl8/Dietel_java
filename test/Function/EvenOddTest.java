package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
  public  void testNumberIsEven() {
      boolean integer = Function.isEven(6);
      assertTrue(integer);
  }

  @Test

    public void testIsOdd(){
        boolean integer = Function.isEven(21);
        assertFalse(integer);
  }

}