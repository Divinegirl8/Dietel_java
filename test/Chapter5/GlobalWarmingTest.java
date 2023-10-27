package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Chapter5.GlobalWarming.*;

class GlobalWarmingTest {

    @Test
    void testGlobalWarmingCount(){
        assertEquals(5,countAnswer("c","b","d","a","d"));
        assertEquals(3,countAnswer("-c","b","-d","a","d"));
    }

    @Test

    void  testComment(){
        assertEquals("Excellent",comment(countAnswer("c","b","d","a","d")));
        assertEquals("Time to brush up on your knowledge of global warming",comment(countAnswer("1","2","3","4","5")));
    }

}