package ttd;

public class SalesCommission {

    private double itemValue;
    private int salary = 200;

    public void setItemValue(int itemValue) {
        this.itemValue += itemValue;
    }

    public double getItemValue() {
        return itemValue;
    }

    public int getSalary() {
        return salary;
    }

    public double grossPay(double itemValue){
        return (9 * itemValue) / 100;
    }

    public double weeklySalary(double itemValue) {
        double grossPay = (9 * itemValue) / 100;

        return salary + grossPay;
    }

}
