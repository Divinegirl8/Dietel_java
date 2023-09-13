package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {

    @Test
    public void testASingleItemValue() {
        SalesCommission sales = new SalesCommission();

        sales.setItemValue(2000);

        assertEquals(2000,sales.getItemValue());

    }

    @Test

    public void testSumOfItemValue() {
        SalesCommission sales = new SalesCommission();

        sales.setItemValue(2000);
        sales.setItemValue(500);
        sales.setItemValue(100);

        assertEquals(2600,sales.getItemValue());
    }

    @Test

    public void  testGrosspay() {
        SalesCommission sales = new SalesCommission();

        sales.setItemValue(2);
        assertEquals(0.18,sales.grossPay(sales.getItemValue()));
    }

    @Test
    public void testWeeklySalaryForOneItem() {

        SalesCommission sales = new SalesCommission();

        sales.setItemValue(200);

        assertEquals(218,sales.weeklySalary(sales.getItemValue()));
    }

    @Test

    public  void testWeeklySalaryForTwoItem() {
        SalesCommission sales = new SalesCommission();

        sales.setItemValue(450);
        sales.setItemValue(400);

        assertEquals(276.5,sales.weeklySalary(sales.getItemValue()));
    }

    @Test

    public void testSalaryForMultipleItem() {
        SalesCommission sales = new SalesCommission();

        sales.setItemValue(340);
        sales.setItemValue(450);
        sales.setItemValue(320);
        sales.setItemValue(890);

        assertEquals(380,sales.weeklySalary(sales.getItemValue()));
    }

}