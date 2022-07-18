package org.example.adapters;

public interface TargetSmartTvInterface {

    void turnTvOn();

    void turnTvOff();

    void showMenu();

    void startPlay(long startTime);

    void ffw(short speed);

    void rwn(short speed);

    void connectToWifi(String wifiName);

    void showWidget(String widgetID);
}
