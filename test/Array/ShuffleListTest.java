package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Array.ShuffleList.shuffleNumber;

class ShuffleListTest {
    @Test

    public void shuffleList() {
        String[] x = {"A","M","C","W","I","T"};
        String result = "[A,W,M,I,C,T]";
        assertEquals(result,shuffleNumber(3,x));
    }

}