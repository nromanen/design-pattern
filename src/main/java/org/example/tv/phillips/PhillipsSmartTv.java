package org.example.tv.phillips;

public class PhillipsSmartTv {
    public void on() {
        System.out.println("Phillips smart TV is on");
    }

    public void off() {
        System.out.println("Phillips smart TV is off");
    }

    public void menu() {
        System.out.println("Phillips smart TV menu opened");
    }

    public void startPlay(long startTime) {
        System.out.println("Phillips smart TV playback started at " + startTime);
    }

    public void ffw(short speed) {
        System.out.println("Phillips smart TV fast forwarding playback with speed " + speed);
    }

    public void rwn(short speed) {
        System.out.println("Phillips smart TV rewind playback with speed " + speed);
    }

    public void connectWifi(String wifiName) {
        System.out.println("Phillips smart TV connected to wireless network with name " + wifiName);
    }

    public void showWidget(String widgetID) {
        System.out.println("Phillips smart TV showing widget with ID " + widgetID);
    }
}
