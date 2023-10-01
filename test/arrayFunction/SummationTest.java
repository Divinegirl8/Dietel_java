package arrayFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static arrayFunction.Functions.*;

class SummationTest {

    @Test

    public  void testSummationFor() {
        double[] integers = {2,3.1,4.3,5.1};
        assertEquals(14.5,summationUsingForLoop(integers));
    }

    @Test
    public  void testSummationForTwo() {
        double[] integers = {2,3,4,5,2,5};
        assertEquals(21,summationUsingForLoop(integers));
    }

    @Test

    public  void testSummationWhile() {
        double[] integers = {2,3,4,5.2};
        assertEquals(14.2,summationUsingWhileLoop(integers));
    }

    @Test

    public  void testSummationWhileTwo() {
        double[] integers = {2,3,4,5,2,5};
        assertEquals(21,summationUsingWhileLoop(integers));
    }

    @Test

    public  void testSummationWhileThree() {
        double[] integers = {54,66};
        assertEquals(120,summationUsingWhileLoop(integers));
    }

    @Test

    public  void testSummationDoWhile() {
        double[] integers = {2,3,4,5.2};
        assertEquals(14.2,summationUsingDoWhileLoop(integers));
    }

    @Test

    public  void testSummationDoWhileTwo() {
        double[] integers = {54,66};
        assertEquals(120,summationUsingDoWhileLoop(integers));
    }

    @Test

    public  void testSummationDoWhileThree() {
        double[] integers = {2,3,4,5,2,5};
        assertEquals(21,summationUsingDoWhileLoop(integers));
    }

    @Test

    public  void testSummationDoWhileFour() {
        double[] integers = {-2,3,4,5,2,5};
        assertEquals(17,summationUsingDoWhileLoop(integers));
    }

    @Test

    public  void testSummationDoWhileFive() {
        double[] integers = {-2.1,8,4,-5,2,5};
        assertEquals(11.9,summationUsingDoWhileLoop(integers));
    }


}