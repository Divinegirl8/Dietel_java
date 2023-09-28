package Chapter5;

public class Triple {
    public static void pythagorean(int side1,int side2,int side3){

        for (int count = 1; count <= side1; count++){
            for (int count2 = 1; count2 <= side2; count2++){
                for (int count3 = 1; count3 <= side3; count3++){
                    if (Math.pow(count,2) + Math.pow(count2,2) == Math.pow(count3,2)){
                   System.out.printf("%d + %d = %d",count,count2,count3);
                   System.out.println();

                }
                }
            }
        }

    }

    public static void main(String[] args) {
        pythagorean(100,100,100);
    }
}
