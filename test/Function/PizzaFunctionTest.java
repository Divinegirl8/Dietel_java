package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Function.PizzaFunction.*;

class PizzaFunctionTest {

    @Test

    void testPizzaBox(){
        assertEquals("Large",pizzaBoxSize("Large"));
        assertEquals("medium",pizzaBoxSize("medium"));
        assertEquals("small",pizzaBoxSize("small"));
    }

    @Test

    void testNumberOfHungrySize(){
        assertEquals(2,numberOfHungrySize(2));
    }

    @Test

    void testNumberOfSuperHungrySize(){
        assertEquals(54,numberOfSuperHungrySize(54));
    }

    @Test

    void testNumberOfClassicSize(){
        assertEquals(100,numberOfClassicSize(100));
    }

    @Test

    void testCalculateSuperHungrySize(){
        assertEquals(16,calculateSuperHungrySize(numberOfSuperHungrySize(4)));
        assertEquals(40,calculateSuperHungrySize(numberOfSuperHungrySize(10)));
        assertEquals(24,calculateSuperHungrySize(numberOfSuperHungrySize(6)));
        assertEquals(0,calculateSuperHungrySize(numberOfSuperHungrySize(0)));
    }

    @Test

    void testCalculateHungrySize(){
        assertEquals(4,calculateHungrySize(2));
        assertEquals(0,calculateHungrySize(0));
        assertEquals(20,calculateHungrySize(10));
    }

    @Test

    void testCalculateClassicSize(){
        assertEquals(4,calculateClassicSize(4));
        assertEquals(0,calculateClassicSize(0));
    }

    @Test

    void testTotalCalculation(){

        assertEquals(21,getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)));
        assertEquals(65,getTotalSize(numberOfSuperHungrySize(10),numberOfHungrySize(10),numberOfClassicSize(5)));
    }

    @Test

    void testCalculateLargestSize(){
        assertEquals(3,calculateLargestSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),10));
        assertEquals(7,calculateLargestSize(getTotalSize(numberOfSuperHungrySize(10),numberOfHungrySize(10),numberOfClassicSize(5)),10));
    }

    @Test

    void testCalculateMediumSize(){
        assertEquals(4,calculateMediumSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),6));
        assertEquals(11,calculateMediumSize(getTotalSize(numberOfSuperHungrySize(10),numberOfHungrySize(10),numberOfClassicSize(5)),6));
    }

    @Test

    void testCalculateSmallSize(){
        assertEquals(6,calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),4));
        assertEquals(17,calculateSmallSize(getTotalSize(numberOfSuperHungrySize(10),numberOfHungrySize(10),numberOfClassicSize(5)),4));
    }

    @Test

    void testLargestTotalSlice(){
        assertEquals(30,calculateLargeTotalSlice(calculateLargestSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),10)));
    }

    @Test

    void testMediumTotalSlice(){
        assertEquals(24,calculateMediumTotalSlice(calculateMediumSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),6)));
    }

    @Test

    void testSmallTotalSlice(){
        assertEquals(24,calculateSmallTotalSlice(calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),4)));
    }

    @Test
    void testRemainingMediumSlice(){
        assertEquals(3,calculateMediumRemainingSlices(calculateMediumTotalSlice(calculateMediumSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),6)),getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1))));
    }

    @Test
    void testRemainingSmallSlice(){
        assertEquals(3,calculateSmallRemainingSlices(calculateSmallTotalSlice(calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),4)),getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1))));
    }

    @Test

    void testRemainingLargeSlice() {
        assertEquals(9,calculateLargeRemainingSlices(calculateLargeTotalSlice(calculateLargestSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),10)),getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1))));
    }

@Test
    void testLargePriceBox(){
        assertEquals(15000,largePriceCalculation(calculateLargestSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),10)));
        assertEquals(35000,largePriceCalculation(calculateLargestSize(getTotalSize(numberOfSuperHungrySize(10),numberOfHungrySize(10),numberOfClassicSize(5)),10)));
}

@Test

void testMediumPriceBox(){assertEquals(12000,mediumPriceCalculation(calculateLargestSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),6)));}

@Test

    void testSmallPriceBox(){
        assertEquals(7200,smallPriceCalculation(calculateSmallSize(getTotalSize(numberOfSuperHungrySize(4),numberOfHungrySize(2),numberOfClassicSize(1)),4)));
}



}