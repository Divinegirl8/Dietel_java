package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {

    @Test
   public void  testToggleButtonIsOn(){

        Mp3Player player = new Mp3Player();

        player.toggle();
        assertTrue(player.checkToggleButton());

   }


   @Test
   public  void  testToggleButtonIsOff() {

        Mp3Player player = new Mp3Player();

        player.toggle();
        player.toggle();
        assertFalse(player.checkToggleButton());

   }

   @Test

    public void connectBluetooth() {
        Mp3Player player = new Mp3Player();

        player.toggle();
        player.bluetoothStatus();
        assertTrue(player.checkBluetooth());

   }

   @Test

    public void  disconnectBluetooth() {
        Mp3Player player = new Mp3Player();

        player.toggle();
        player.bluetoothStatus();
        player.bluetoothStatus();
        assertFalse(player.checkBluetooth());
   }

   @Test

   public void connectCharger() {
        Mp3Player player = new Mp3Player();

        player.chargingStatus();

        assertTrue(player.isCharger());


   }

   @Test
   public  void disconnectCharger() {
        Mp3Player player = new Mp3Player();

        player.chargingStatus();
        player.chargingStatus();

        assertFalse(player.isCharger());
   }

   @Test

    public void  testNextButton(){
        Mp3Player player = new Mp3Player();

        player.goToNext();
        assertEquals(1,player.checkNext());

   }

   @Test
   public void testPreviousButton() {
       Mp3Player player = new Mp3Player();
       player.toggle();
       player.bluetoothStatus();
        for (int count = 0; count < 3; count++){
            player.goToNext();
       }
        assertEquals(3,player.checkNext());
        player.goToPrevious();
        assertEquals(2,player.checkNext());
   }

   @Test
   public void testStopButton() {
        Mp3Player player = new Mp3Player();

        player.toggle();
        player.bluetoothStatus();
        player.stopMusic();
        assertFalse(player.isMusic());
   }

   @Test
   public  void testPlayMusic() {
        Mp3Player player = new Mp3Player();

       player.toggle();
       player.bluetoothStatus();
       player.stopMusic();
       player.playMusic();
       assertTrue(player.isMusic());

   }

   @Test

   public  void testPauseMusic() {
        Mp3Player player = new Mp3Player();

       player.toggle();
       player.bluetoothStatus();
       player.pauseMusic();
       assertFalse(player.isMusic());

   }

   @Test

   public void increaseVolumeButton() {
        Mp3Player player = new Mp3Player();
       player.toggle();
       player.bluetoothStatus();
   for (int count = 0; count <= 7; count++){
       player.increaseVolume();
   }
       assertEquals(7,player.checkVolume());

   }

   @Test
   public void  decreaseVolumeButton() {
       Mp3Player player = new Mp3Player();
       player.toggle();
       player.bluetoothStatus();
       for (int count = 0; count <= 7; count++){
           player.increaseVolume();
       }
       player.decreaseVolume();
       assertEquals(6,player.checkVolume());

   }


}