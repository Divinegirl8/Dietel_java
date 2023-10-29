package pythonDict;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static pythonDict.SplitList.*;
import static java.util.Arrays.*;

class SplitListTest {
  @Test
    void testOne(){
      int[] values = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
      int[] result = {10, 75, 20, 30, 15};
      assertArrayEquals(result,split1(values));
  }

  @Test
  void testTwo(){
    int[] values = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
    int[] result = {5, 40, 25, 40, 35};
    assertArrayEquals(result,split2(values));
  }


  @Test
  void testThree(){
    int[] values = {20, 30, 15, 5};
    int[] result = {15,5};
    assertArrayEquals(result,split2(values));
  }

  @Test
  void testFour(){
    int[] values = {15, 5, 40, 25, 40, 35};
    int[] result = {15, 5,40};
    assertArrayEquals(result,split1(values));
  }

  @Test
  void testFive(){
    int[] values = {10, 75, 20, 30, 15, 5, 40, 25, 40, 35};
    String result = "[10, 75, 20, 30, 15] , [5, 40, 25, 40, 35]";
    assertEquals(result, joinBothList(split1(values),split2(values)));
  }

}