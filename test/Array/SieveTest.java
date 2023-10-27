package Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static Array.Sieve.*;


class SieveTest {
@Test
    void testSieve(){
     int[] result = {2,3,5,7};
     assertArrayEquals(result,eratosthenes(1,10));
}

@Test
    void testSieveTwo(){
    int[] result = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
    assertArrayEquals(result,eratosthenes(-1,-114));
}

@Test
    void  testSieveThree(){
    int[] result = {11, 13, 17, 19, 23, 29};
    assertArrayEquals(result,eratosthenes(11,-30));
}

@Test
    void  testSieveFour(){
    int[] result = {101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    assertArrayEquals(result,eratosthenes(101,-200));
}
}