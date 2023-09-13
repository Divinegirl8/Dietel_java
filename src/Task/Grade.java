package Task;

public class Grade {

    private String name;
    private double average;


//    public Task.Grade(String name , double average) {
//        this.name = name;
//        this.average = average;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average){
        if (average > 0) {
            if (average <= 100) {
                this.average = average;
            }
        }

    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String checkGrade() {
        String quote = "";

        if(average >= 90.0) {
           quote = "A";
        }

       else if (average >= 80.0){

            quote = "B";

        }

       else if (average >= 70.0) {
            quote = "C";
        }

        else if (average >= 60.0) {
            quote = "D";
        }

        else {
            quote = "F";
        }

        return quote;

    }

}
