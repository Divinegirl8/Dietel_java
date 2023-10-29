package pythonDict;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import static pythonDict.ListToDict.*;

class ListToDictTest {
@Test
    void testOne(){
    String[] element1 = {"a", "b", "c", "d", "e"};
    int[] element2 = {1, 2, 3, 4, 5};

    Map<String,Integer> expected = twoList(element1,element2);
    assertEquals(5,expected.size());
    assertEquals(1,expected.get("a"));
    assertEquals(4,expected.get("d"));

}
}