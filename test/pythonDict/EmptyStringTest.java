package pythonDict;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pythonDict.emptyString.*;

class EmptyStringTest {
    @Test

    void testOne(){
        String[] sample_input = {"", "ABC", "xyz", "", "abc", "XYZ"};
        String[] expected = {"ABC", "xyz","abc", "XYZ"};
        assertArrayEquals(expected,removeEmptyString(sample_input));
    }

    @Test
    void testTwo(){
   String[] sample_input = {"", "Mr Chibuzo", "", "", "", "", "", "Nwosu"};
   String[] expected  = {"Mr Chibuzo","Nwosu"};
   assertArrayEquals(expected,removeEmptyString(sample_input));

}}