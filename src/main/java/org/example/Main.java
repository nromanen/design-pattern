package org.example;

import org.example.adapters.PhillipsAdapter;
import org.example.adapters.SamsungAdapter;
import org.example.adapters.SonyAdapter;
import org.example.adapters.TargetSmartTvInterface;
import org.example.tv.phillips.PhillipsSmartTv;
import org.example.tv.samsung.SamsungSmartTv;
import org.example.tv.sony.Connector;
import org.example.tv.sony.SonySmartTv;

public class Main {

    public static void main(String[] args) {

        System.out.println("NOT USING THE ADAPTER PATTERN.");

        Connector sonyConnector = new Connector();
        SonySmartTv sonyInterface = sonyConnector.turnSonyTvOn();
        sonyInterface.connectToWifi("myPersonalWifi");
        sonyInterface.openWidget("wifi.connected.notificator");
        sonyInterface.play(0);

        PhillipsSmartTv phillipsSmartTv = new PhillipsSmartTv();
        phillipsSmartTv.on();
        phillipsSmartTv.connectWifi("myPersonalWifi");
        phillipsSmartTv.showWidget("wifinotifier");
        phillipsSmartTv.startPlay(0);

        SamsungSmartTv samsungSmartTv = new SamsungSmartTv();
        samsungSmartTv.turnOn();
        samsungSmartTv.wifiConn("myPersonalWifi");
        samsungSmartTv.showWidget("wifi.notificator");
        samsungSmartTv.startPlayback(0);



        System.out.println("\n\nWITH THE ADAPTER PATTERN.");


        SonyAdapter sonyAdapter = new SonyAdapter(new Connector());
        connectWifiAndPlay(sonyAdapter, "wifi.connected.notificator");

        PhillipsAdapter phillipsAdapter = new PhillipsAdapter(new PhillipsSmartTv());
        connectWifiAndPlay(phillipsAdapter, "wifinotifier");

        SamsungAdapter samsungAdapter = new SamsungAdapter(new SamsungSmartTv());
        connectWifiAndPlay(samsungAdapter, "wifi.notificator");
    }


    private static void connectWifiAndPlay(TargetSmartTvInterface smartTVInterface, String wifiNotificationWidgetId) {
        smartTVInterface.turnTvOn();
        smartTVInterface.connectToWifi("myPersonalWifi");
        smartTVInterface.showWidget(wifiNotificationWidgetId);
        smartTVInterface.startPlay(0);
    }

}
