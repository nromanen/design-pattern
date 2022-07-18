package org.example.tv.sony;

public class SonySmartTv {

    SonySmartTv() {
    }

    public void openMenu() {
        System.out.println("Sony smart TV menu opened");
    }

    public void play(long startTime) {
        System.out.println("Sony smart TV playback started at " + startTime);
    }

    public void fastForwardPlayback(int speed) {
        System.out.println("Sony smart TV fast forwarding playback with speed " + speed);
    }

    public void rewindPlayback(int speed) {
        System.out.println("Sony smart TV rewind playback with speed " + speed);
    }

    public void connectToWifi(String wifiName) {
        System.out.println("Sony smart TV connected to wireless network with name " + wifiName);
    }

    public void openWidget(String widgetID) {
        System.out.println("Sony smart TV showing widget with ID " + widgetID);
    }
}
