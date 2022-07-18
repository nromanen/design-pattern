package org.example.adapters;


import org.example.tv.sony.Connector;
import org.example.tv.sony.SonySmartTv;

public class SonyAdapter implements TargetSmartTvInterface {

    private final Connector sonyConnector;

    private SonySmartTv sonySmartTv;

    public SonyAdapter(Connector sonyConnector) {
        this.sonyConnector = sonyConnector;
    }


    public void turnTvOn() {
        sonySmartTv = sonyConnector.turnSonyTvOn();
    }

    public void turnTvOff() {
        sonyConnector.turnSonyTvOff();
    }

    public void showMenu() {
        sonySmartTv.openMenu();
    }

    public void startPlay(long startTime) {
        sonySmartTv.play(startTime);
    }

    public void ffw(short speed) {
        sonySmartTv.fastForwardPlayback(speed);
    }

    public void rwn(short speed) {
        sonySmartTv.rewindPlayback(speed);
    }

    public void connectToWifi(String wifiName) {
        sonySmartTv.connectToWifi(wifiName);
    }

    public void showWidget(String widgetID) {
        sonySmartTv.openWidget(widgetID);
    }

}
