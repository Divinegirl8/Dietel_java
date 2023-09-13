package ttd;

public class AirConditioner {

private boolean acSocket;
private int temperature = 16;




public void increaseTemperature(){

    if(temperature < 30) {
        temperature = temperature + 1;


    }
    else {

        this.temperature = temperature;


    }

}

public void decreaseTemperature () {
    if (temperature > 16) {
        temperature = temperature - 1;
    }

    else{
        this.temperature = temperature;
    }

}


public void toggle() {
    if(!acSocket) {
        acSocket = true;
    }

    else {
        acSocket = false;
    }


}





// check

    public boolean checkIsOn () {
        return acSocket;

    }

    public int checkTemperature() {
        return temperature;
    }


}
