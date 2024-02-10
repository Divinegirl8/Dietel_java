package PYTHON;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static PYTHON.CountString.*;

class CountStringTest {
    @Test void functionCanCountValues(){
        String input = "semicolon.africa";
        Map<String,Integer> expected = frequency(input);
        assertEquals(12,expected.size());
        assertEquals(1,expected.get("s"));
        assertEquals(2,expected.get("a"));
    }


}