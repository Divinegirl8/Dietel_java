package BinarySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static BinarySnacks.BinaryFunction.*;

class BinaryFunctionTest {
@Test

    void decimalToBinaryTest(){
    assertEquals(1101,decimalToBinary(13));
    assertEquals(10101110,decimalToBinary(-174));
}

@Test

    void binaryToDecimalTest(){
    assertEquals(174,binaryToDecimal( decimalToBinary(-174)));
    assertEquals(13,binaryToDecimal(decimalToBinary(13)));
    assertEquals(4,binaryToDecimal(1-101));
}
}