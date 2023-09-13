package Chapter3;

public class CarTest {

    public static void main(String[] args) {

        Car honda = new Car("suv ces" , "2020" , 35000000);
        Car benz = new Car("maybach" , "2021" , 105000000);

        System.out.printf("The discounted price for the honda is %.0f%n", honda.getPrice() * 5 / 100);
        System.out.printf("The discounted price for the benz is %.0f%n", benz.getPrice() * 7 / 100);

    }
}
