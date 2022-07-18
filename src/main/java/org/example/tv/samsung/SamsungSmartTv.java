package org.example.tv.samsung;

public class SamsungSmartTv {

    public void turnOn() {
        System.out.println("Samsung smart TV is on");
    }

    public void turnOff() {
        System.out.println("Samsung smart TV is off");
    }

    public void openMenu() {
        System.out.println("Samsung smart TV menu opened");
    }

    public void startPlayback(long startTime) {
        System.out.println("Samsung smart TV playback started at " + startTime);
    }

    public void ffwPlayback(short speed) {
        System.out.println("Samsung smart TV fast forwarding playback with speed " + speed);
    }

    public void rwnPlayback(short speed) {
        System.out.println("Samsung smart TV rewind playback with speed " + speed);
    }

    public void wifiConn(String wifiName) {
        System.out.println("Samsung smart TV connected to wireless network with name " + wifiName);
    }

    public void showWidget(String widgetID) {
        System.out.println("Samsung smart TV showing widget with ID " + widgetID);
    }
}
