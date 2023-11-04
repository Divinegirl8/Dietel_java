package Function;


import Function.pizzaModify.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Function.pizzaModify.MultiplyPizzaSlice.*;
import static Function.pizzaModify.NumberOfBoxesRecommendation.*;
import static Function.pizzaModify.TotalNumberOfSlices.*;



class ModifyPizzaTest {
  @Test
    void testAppetiteSuperHungry(){
      AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFSUPERHUNGRYSLICES;
      int expected = appetiteSlice.getSuperHungry();
      assertEquals(4,expected);
  }

  @Test

  void testAppetiteHungry(){
    AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFHUNGRYSLICES;
    int expected = appetiteSlice.getHungry();
    assertEquals(2,expected);
  }

  @Test

  void testAppetiteClassic(){
    AppetiteSlice appetiteSlice = AppetiteSlice.NUMBEROFCLASSICSLICES;
    int expected = appetiteSlice.getClassic();
    assertEquals(1,expected);
  }

  @Test

  void testLargePizzaSize(){
    PizzaSize pizzaSize = PizzaSize.LARGESIZESLICE;
      int expected = pizzaSize.getLargeSize();
      assertEquals(10,expected);
  }

  @Test

  void testMediumPizzaSize(){
    PizzaSize pizzaSize = PizzaSize.MEDIUMSIZESLICE;
    int expected = pizzaSize.getMediumSize();
    assertEquals(6,expected);
  }

  @Test

  void testSmallPizzaSize(){
    PizzaSize pizzaSize = PizzaSize.SMALLSIZESLICE;
    int expected = pizzaSize.getSmallSize();
    assertEquals(4,expected);
  }

  @Test

  void testLargePrice(){
    PizzaPrice pizzaPrice = PizzaPrice.LARGESIZEPRICE;
    int expected = pizzaPrice.getLarge();
    assertEquals(5000,expected);
  }

  @Test

  void testMediumPrice(){
    PizzaPrice pizzaPrice = PizzaPrice.MEDIUMSIZEPRICE;
    int expected = pizzaPrice.getMedium();
    assertEquals(3000,expected);
  }

  @Test

  void testSmallPrice(){
    PizzaPrice pizzaPrice = PizzaPrice.SMALLSIZEPRICE;
    int expected = pizzaPrice.getSmall();
    assertEquals(1200,expected);
  }

  @Test

  void testPizzaBoxSizeChoice(){
    UserOption userOption = new UserOption();
    userOption.setPizzaBoxSize("Medium");
    assertEquals("Medium",userOption.getPizzaBoxSize());
  }

  @Test

  void testSuperHungrySize(){
    UserOption userOption = new UserOption();
    userOption.setNumberOfSuperHungrySize(4);
    assertEquals(4,userOption.getNumberOfSuperHungrySize());
  }

  @Test

  void testHungrySize(){
    UserOption userOption = new UserOption();
    userOption.setNumberOfHungrySize(2);
    assertEquals(2,userOption.getNumberOfHungrySize());
  }

  @Test

  void testClassicSize(){
    UserOption userOption = new UserOption();
    userOption.setNumberOfClassicSize(1);
    assertEquals(1,userOption.getNumberOfClassicSize());
  }

  @Test

  void testCalculateSuperHungrySize(){
    assertEquals(16,calculateSuperHungrySize(4));
    assertEquals(40,calculateSuperHungrySize(10));
    assertEquals(0,calculateSuperHungrySize(0));
    assertEquals(0,calculateSuperHungrySize(-90));
    assertEquals(4,calculateSuperHungrySize(1));

  }

  @Test

  void testCalculateHungrySize(){
    assertEquals(4,calculateHungrySize(2));
    assertEquals(20,calculateHungrySize(10));
    assertEquals(0,calculateHungrySize(0));
    assertEquals(0,calculateHungrySize(-1));
    assertEquals(2,calculateHungrySize(1));
  }

  @Test

  void testCalculateClassicSize(){
    assertEquals(1,calculateClassicSize(1));
    assertEquals(200,calculateClassicSize(200));
    assertEquals(0,calculateHungrySize(0));
    assertEquals(0,calculateClassicSize(-500));
    assertEquals(1,calculateClassicSize(1));
  }

  @Test

  void testTotalSlices(){
    assertEquals(21, TotalOfPizzaSlice.pizzaSliceTotal(4,2,1));
    assertEquals(65,TotalOfPizzaSlice.pizzaSliceTotal(10,10,5));
    assertEquals(0,TotalOfPizzaSlice.pizzaSliceTotal(0,0,0));

  }

  @Test

  void testNumberOfBoxesLarge(){
    assertEquals(3,calculateLargestSize(4,2,1));
    assertEquals(7,calculateLargestSize(10,10,5));
    assertEquals(0,calculateLargestSize(0,0,0));
  }

  @Test

  void testNumberOfBoxesMedium(){
    assertEquals(4,calculateMediumSize(4,2,1));
    assertEquals(11,calculateMediumSize(10,10,5));
    assertEquals(0,calculateMediumSize(0,0,0));
  }

  @Test

  void testNumberOfBoxesSmall(){
    assertEquals(6,calculateSmallSize(4,2,1));
    assertEquals(17,calculateSmallSize(10,10,5));
    assertEquals(0,calculateSmallSize(0,0,0));
  }

  @Test

  void testLargeTotalNumberOfSlice(){
    assertEquals(30,calculateLargeTotalSlice(4,2,1));
    assertEquals(70,calculateLargeTotalSlice(10,10,5));
    assertEquals(0,calculateLargeTotalSlice(0,0,0));
  }

  @Test

  void testMediumTotalNumberOfSlice(){
    assertEquals(24,calculateMediumTotalSlice(4,2,1));
    assertEquals(66,calculateMediumTotalSlice(10,10,5));
  }

  @Test

  void testSmallTotalNumberOfSlice(){
    assertEquals(24,calculateSmallTotalSlice(4,2,1));
    assertEquals(68,calculateSmallTotalSlice(10,10,5));
  }

  @Test

  void testLargeRemainingSlice(){
    assertEquals(9,RemainingSlices.largeRemainingSlice(4,2,1));
  }

  @Test

  void testMediumRemaining(){assertEquals(3,RemainingSlices.mediumRemainingSlice(4,2,1));}

  @Test

  void testSmallRemaining(){assertEquals(3,RemainingSlices.smallRemainingSlice(4,2,1));}

  @Test

  void testCustomerLargePrice(){
    assertEquals(15000,CustomerTotalPrice.customerPriceForLargeSize(4,2,1));
    assertEquals(35000,CustomerTotalPrice.customerPriceForLargeSize(10,10,5));
  }
  @Test

  void testCustomerMediumPrice(){
    assertEquals(12000,CustomerTotalPrice.customerPriceForMediumSize(4,2,1));
  }

  @Test

  void testCustomerSmallPrice(){
    assertEquals(7200,CustomerTotalPrice.customerPriceForSmallSize(4,2,1));
  }

  @Test

  void testDisplayLargeInformation(){
    String expected = """
                Number of Slices: 30
                Number of Boxes: 3
                Number of Slices left: 9
                Total cost to spend: 15000
                """;
    assertEquals(expected,DisplayMessage.displayLarge(4,2,1));
  }

  @Test

  void testDisplayMediumInformation(){
    String expected = """
                Number of Slices: 24
                Number of Boxes: 4
                Number of Slices left: 3
                Total cost to spend: 12000
                """;
    assertEquals(expected,DisplayMessage.displayMedium(4,2,1));
  }

  @Test

  void testDisplaySmallInformation(){
    String expected = """
                Number of Slices: 24
                Number of Boxes: 6
                Number of Slices left: 3
                Total cost to spend: 7200
                """;
    assertEquals(expected,DisplayMessage.displaySmall(4,2,1));}



@Test

void testDisplayMessage(){
  String expected = """
                Number of Slices: 70
                Number of Boxes: 7
                Number of Slices left: 5
                Total cost to spend: 35000
                """;
  assertEquals(expected,DisplayCustomerInvoice.customerInvoice("Large", 10, 10, 5));
}

  @Test

  void testDisplayMessage2(){
    String expected = """
                Number of Slices: 24
                Number of Boxes: 4
                Number of Slices left: 3
                Total cost to spend: 12000
                """;
    assertEquals(expected,DisplayCustomerInvoice.customerInvoice("Medium", 4, 2, 1));
  }

  @Test

  void testDisplayMessage3(){
    String expected = """
                Number of Slices: 68
                Number of Boxes: 17
                Number of Slices left: 3
                Total cost to spend: 20400
                """;
    assertEquals(expected,DisplayCustomerInvoice.customerInvoice("Small", 10, 10, 5));
  }
}