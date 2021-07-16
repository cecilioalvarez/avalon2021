package com.arquitecturajava.interfaces.bulb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Room {
    
    private final ArrayList<Connectable> electronicDevices = new ArrayList<>();

    private void addBulbs(Bulb ...bulbs) {
        Collections.addAll(this.electronicDevices, bulbs);
    }
    
    private void addConnectables(Connectable ...connectables) {
        Collections.addAll(this.electronicDevices, connectables);
    }
    
    private void removeConnectables(Connectable ...connectables) {
        this.electronicDevices.removeAll(Arrays.asList(connectables));
    }
    
    private void turnDevices(boolean power) {
        this.electronicDevices.forEach(device -> device.setPower(power));
    }
    
    private void showDevicesStatus() {
        this.electronicDevices.forEach(device -> System.out.println(device.toString()));
    }
    
    private void showWattage() {
        int wattage = 0;
        for (Connectable device : this.electronicDevices) {
            if (device instanceof Bulb) {
                wattage += ((Bulb) device).getWattage();
            }
        }
        System.out.println("La potencia total de las bombillas de la habitación son " + wattage + " W (vatios).");
    }
    
    private void showMaxWattage() {
        int maxWattage = 0;
        for (Connectable device : this.electronicDevices) {
            if (device instanceof Bulb) {
                Bulb bulb = (Bulb) device;
                if (bulb.getWattage() > maxWattage) {
                    maxWattage = bulb.getWattage();
                }
            }
        }
        System.out.println("La(s) bombilla(s) con mayor potencia de la habitación tienen " + maxWattage + " W (vatios).");
    }

    public static void main(String[] args) {
        Room bedroom = new Room();
        bedroom.addBulbs(new Bulb(), new Bulb(60), new Bulb(60, true), new Bulb(true), new Bulb(), new Bulb(80, true));
        bedroom.addConnectables(new Tv(), new Bulb(), new Tv(true), new Tv(true), new Bulb(60));
        bedroom.showDevicesStatus();
        bedroom.turnDevices(true);
        bedroom.showDevicesStatus();
        bedroom.turnDevices(false);
        bedroom.showDevicesStatus();
        bedroom.showWattage();
        bedroom.showMaxWattage();
    }
}