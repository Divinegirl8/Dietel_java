package ttd;

public class Mp3Player {

    private boolean toggleButton;
    private  boolean bluetooth;
    private  boolean charger;

    private int musicStatus;
    private boolean music;

    private  int volumeButton;


    public void toggle(){
        if (!toggleButton) {
            toggleButton = true;
        }
        else {
            toggleButton = false;
        }
    }

    public  boolean checkToggleButton() {
        return  toggleButton;
    }


    public void  bluetoothStatus(){
        if (!bluetooth){
            bluetooth = true;
        }
        else {
            bluetooth = false;
        }
    }

    public boolean checkBluetooth() {
        return bluetooth;
    }


    public void chargingStatus() {
        if (!charger) {
            charger = true;
        }
        else  {
            charger = false;
        }
    }

    public boolean isCharger() {
        return charger;
    }

    public void goToNext() {
        musicStatus +=1;
    }

    public void goToPrevious() {
        if (musicStatus > 0) {
        musicStatus -=1;}
    }

    public int checkNext() {
        return musicStatus;
    }


    public void stopMusic() {
        music = false;

    }
    public void pauseMusic() {
        music = false;
    }

    public void  playMusic() {
        music = true;
    }

    public boolean isMusic() {
        return music;
    }


    public  void increaseVolume(){
        if (volumeButton < 7) {
            volumeButton += 1;
        }
        else {
            this.volumeButton = volumeButton;
        }

    }

    public  void decreaseVolume(){
        if (volumeButton > 0) {
            volumeButton -= 1;
        }
        else {
            this.volumeButton = volumeButton;
        }

    }

    public int checkVolume() {
        return volumeButton;
    }

}
