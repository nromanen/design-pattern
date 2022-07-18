package org.example.adapters;


import org.example.tv.phillips.PhillipsSmartTv;

public class PhillipsAdapter implements TargetSmartTvInterface {

    private final PhillipsSmartTv phillipsSmartTv;

    public PhillipsAdapter(PhillipsSmartTv phillipsSmartTv) {
        this.phillipsSmartTv = phillipsSmartTv;
    }



    public void turnTvOn() {
        phillipsSmartTv.on();
    }

    public void turnTvOff() {
        phillipsSmartTv.off();
    }

    public void showMenu() {
        phillipsSmartTv.menu();
    }

    public void startPlay(long startTime) {
        phillipsSmartTv.startPlay(startTime);
    }

    public void ffw(short speed) {
        phillipsSmartTv.ffw(speed);
    }

    public void rwn(short speed) {
        phillipsSmartTv.rwn(speed);
    }

    public void connectToWifi(String wifiName) {
        phillipsSmartTv.connectWifi(wifiName);
    }

    public void showWidget(String widgetID) {
        phillipsSmartTv.showWidget(widgetID);
    }

}
