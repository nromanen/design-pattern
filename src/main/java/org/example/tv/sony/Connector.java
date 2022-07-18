package org.example.tv.sony;

public class Connector {

    public SonySmartTv turnSonyTvOn() {
        System.out.println("Sony smart TV is on");

        return new SonySmartTv();
    }

    public void turnSonyTvOff() {
        System.out.println("Sony smart TV is off");
    }
}
