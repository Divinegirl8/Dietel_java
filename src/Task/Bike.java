package Task;

public class Bike {

    private  String name;
    private boolean isOn;


    public void setOn(boolean isOn) {

        this.isOn = isOn;
//        this.isOn = true;
//        System.out.println("bike is on \n");

    }





    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }
}
