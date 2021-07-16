package com.arquitecturajava.poo.bulb_2;

import java.util.ArrayList;
import java.util.Collections;

class Room {
    
    private ArrayList<Bulb> bulbs = new ArrayList<>();

    private void addBulbs(Bulb ...bulbs) {
        Collections.addAll(this.bulbs, bulbs);
    }
    
    private void turnLights(boolean power) {
        this.bulbs.forEach(bulb -> bulb.setPower(power));
    }
    
    private void showBulbsStatus() {
        this.bulbs.forEach(bulb -> System.out.println(bulb.toString()));
    }
    
    private void showWattage() {
        int wattage = this.bulbs.stream().mapToInt(bulb -> bulb.getWattage()).sum();
        System.out.println("La potencia total de la habitación son " + wattage + " W (vatios).");
    }

    public static void main(String[] args) {
        Room bedroom = new Room();
        bedroom.addBulbs(new Bulb(), new Bulb(60), new Bulb(60, true), new Bulb(true), new Bulb(), new Bulb(80, true));
        bedroom.showBulbsStatus();
        bedroom.turnLights(true);
        bedroom.showBulbsStatus();
        bedroom.turnLights(false);
        bedroom.showBulbsStatus();
        bedroom.showWattage();
    }
}