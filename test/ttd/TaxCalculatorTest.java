package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test

    public void testName() {
        TaxCalculator tax = new TaxCalculator();
        tax.setName("Adele");
        assertEquals("Adele",tax.getName());

    }

    @Test
    public void testSalary() {
        TaxCalculator tax = new TaxCalculator();
        tax.setSalary(245000);
        assertEquals(245000,tax.getSalary());

    }

    @Test

    public void testSalaryBelow() {
        TaxCalculator tax = new TaxCalculator();
        tax.setSalary(24500);
        assertEquals(3675,tax.checkSalary(tax.getSalary()));
    }

    @Test

    public  void  testSalaryAbove() {
        TaxCalculator tax = new TaxCalculator();
        tax.setSalary(45000);
        assertEquals(9000,tax.checkSalary(tax.getSalary()));

    }

}