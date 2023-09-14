package ttd;

public class TaxCalculator {

private String name;
private  double salary;

public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public  double getSalary() {
    return salary;
}

public double checkSalary(double salary){
    if (salary <= 30_000) {
        return (15 * salary) / 100;
    }

    else {
        return  (20 * salary) / 100;
    }
}

    public double checkYearlyTax(double salary){
        if (salary <= 30_000) {
          double tax =  (15 * salary) / 100;

            return tax * 12;
        }

        else {
            double tax =  (20 * salary) / 100;
            return tax * 12;
        }
    }


}
