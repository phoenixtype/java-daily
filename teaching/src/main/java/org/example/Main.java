package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SavvyMonitor savvyMonitor = new SavvyMonitor("black", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor1 = new SavvyMonitor("blue", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor2 = new SavvyMonitor("grey", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor3 = new SavvyMonitor("purple", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor4 = new SavvyMonitor("pink", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor5 = new SavvyMonitor("white", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor6 = new SavvyMonitor("yellow", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor7 = new SavvyMonitor("indigo", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor8 = new SavvyMonitor("violet", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor9 = new SavvyMonitor("green", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor10 = new SavvyMonitor("neutral", 21, 7, 200, "Insigna", 0);
        SavvyMonitor savvyMonitor11 = new SavvyMonitor("red", 21, 7, 200, "Insigna", 0);

        List<SavvyMonitor> monitorFactory = new ArrayList<SavvyMonitor>();
        monitorFactory.add(savvyMonitor);
        monitorFactory.add(savvyMonitor2);
        monitorFactory.add(savvyMonitor3);
        monitorFactory.add(savvyMonitor4);
        monitorFactory.add(savvyMonitor5);
        monitorFactory.add(savvyMonitor6);
        monitorFactory.add(savvyMonitor7);
        monitorFactory.add(savvyMonitor8);
        monitorFactory.add(savvyMonitor9);
        monitorFactory.add(savvyMonitor10);
        monitorFactory.add(savvyMonitor11);

        for (SavvyMonitor savvyMonitorObjects: monitorFactory) {
            System.out.println(savvyMonitorObjects);
        }
    }
}