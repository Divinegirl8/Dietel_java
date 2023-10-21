package BinarySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static BinarySnacks.BinaryFunction.*;

class BinaryFunctionTest {
@Test

    void decimalToBinaryTest(){
    assertEquals("1101",decimalToBinary(13));
    assertEquals("10101110",decimalToBinary(-174));
}

@Test

    void binaryToDecimalTest(){
    assertEquals(174,binaryToDecimal(-10101110));
    assertEquals(13,binaryToDecimal(1101));
    assertEquals(4,binaryToDecimal(1-101));
}
}