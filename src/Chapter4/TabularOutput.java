package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.print("N\tN2\tN3\tN4\n");
        for(int count = 1; count <= 5; count++) {

            int n2 = count * count;
            int n3 = count * count * count;
            int n4 = count * count * count * count;



            System.out.println(count + "\t" + n2 + "\t" + n3 + "\t" + n4);



        }


   }
}
