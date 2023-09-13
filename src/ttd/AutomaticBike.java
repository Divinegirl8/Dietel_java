package ttd;

public class AutomaticBike {

    private int speed = 0;
    private int gear;

    private boolean engineKey;



    public int getSpeed(){
        return speed;
    }

    public int getGear(){
        return gear;
    }

    public  boolean checkToggle() {
        return engineKey;
    }


    public void keyHole() {
        if(!engineKey){
            engineKey = true;
        } else{
            engineKey = false;
        }
    }



    public void acceleration() {

        if (speed == 0 || speed <= 19) {

            speed += 1;

            gear = 1;

        }

        else if (speed == 21 || speed <= 29) {

            speed += 2;

            gear = 2;

        }

        else if (speed == 31 || speed <= 39) {

            speed += 3;
             gear = 3;

        }

        else  {

            speed += 4;

            gear = 4;


        }

    }

    public  void  deceleration() {

        if (speed >= 0 && speed <= 20) {

            speed -= 1;

            gear = 1;

        }

        else if (speed >= 21 && speed <= 30) {

            speed -= 2;

            gear = 2;

        }

        else if (speed > 31 && speed <= 43) {

            speed -= 3;
            gear = 3;

        }

        else {

            speed -= 4;

            gear = 4;


        }


    }

}
