package Array;

public class ShuffleList {

    public static  String shuffleNumber(int number, String... letters){
        StringBuilder final_output = new StringBuilder("[");

        int result = letters.length / 2;
        String[] pick1 = new String[result];
        String[] pick2 = new  String[result];

        if (result == number) {

            for (int count = 0; count < result; count++) {
                pick1[count] = letters[count];
            }

            for (int count2 = result; count2 < letters.length; count2++) {
                pick2[count2 - result] = letters[count2];
            }

            for (int count = 0; count < result; count++) {
                final_output.append(pick1[count]).append(",").append(pick2[count]);

                if (count < result - 1) {
                    final_output.append(",");
                }

            }
            final_output.append("]");


        }
        return final_output.toString();
    }
    }





