package org.example.adapters;

import org.example.tv.samsung.SamsungSmartTv;

public class SamsungAdapter implements TargetSmartTvInterface {

    private final SamsungSmartTv samsungSmartTv;

    public SamsungAdapter(SamsungSmartTv samsungSmartTv) {
        this.samsungSmartTv = samsungSmartTv;
    }


    public void turnTvOn() {
        samsungSmartTv.turnOn();
    }

    public void turnTvOff() {
        samsungSmartTv.turnOff();
    }

    public void showMenu() {
        samsungSmartTv.openMenu();
    }

    public void startPlay(long startTime) {
        samsungSmartTv.startPlayback(startTime);
    }

    public void ffw(short speed) {
        samsungSmartTv.ffwPlayback(speed);
    }

    public void rwn(short speed) {
        samsungSmartTv.rwnPlayback(speed);
    }

    public void connectToWifi(String wifiName) {
        samsungSmartTv.wifiConn(wifiName);
    }

    public void showWidget(String widgetID) {
        samsungSmartTv.showWidget(widgetID);
    }

}
