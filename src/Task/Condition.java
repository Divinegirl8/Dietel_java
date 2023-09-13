package Task;
public class Condition {
    public static void main(String[] args) {
        int y =0;
        if (y > 0) {
            int x = 1;
            System.out.println(x);
        }
        int score = 90;
        int pay = 550;
        if (score > 90) {
            pay = pay * 3 / 100;
            System.out.println(pay);
        }
        else {
            pay = pay * 1/100;
            System.out.println(pay);
        }

        int number = 3;

        if (number % 2 == 0)
          // This prints if the condition is only true
            System.out.println(number + " is even.");

         // This prints if the condition is both false and true
        System.out.println(number + " is odd.");

        int firstNUmber = 2;
        int secondNumber =0;
        int thirdNumber = 27;

        int largeNumbers = 0;


        if(firstNUmber > secondNumber) {
            if (firstNUmber > thirdNumber) {
                largeNumbers = firstNUmber;
            }
        }

        if(secondNumber > firstNUmber) {
            if (secondNumber > thirdNumber) {
                largeNumbers = secondNumber;
            }
        }

        if(thirdNumber > firstNUmber) {
            if (thirdNumber > secondNumber) {
                largeNumbers = thirdNumber;
            }
        }

        System.out.println(largeNumbers);

        int x = 3;
        int z =3;

        if (x > 2) {
            if (z > 2) {
               int r = x + z;
                System.out.println("z is " + r);
            }
        }
        else
            System.out.println("x is " + x);

        score = 75;

        if (score >= 90.0)
            System.out.println("A");
        else if (score >= 80.0)
            System.out.println("B");
        else if (score >= 70.0)
            System.out.println("C");
        else if (score >= 60.0)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
