package com.arquitecturajava.poo.bulb_2;

public class Bulb {

    private static int count;
    private int id;
    private int wattage;
    private boolean power;
    
    Bulb() {
        this.id = ++Bulb.count;
        this.wattage = 40;
        this.power = false;
    }
    
    Bulb(int wattage) {
        this.id = ++Bulb.count;
        this.wattage = wattage;
        this.power = false;
    }
    
    Bulb(boolean power) {
        this.id = ++Bulb.count;
        this.wattage = 40;
        this.power = power;
    }

    Bulb(int wattage, boolean power) {
        this.id = ++Bulb.count;
        this.wattage = wattage;
        this.power = power;
    }
    
    boolean isOn() {
        return this.power;
    }
    
    void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "La bombilla nº " + this.id + " tiene una potencia de " + this.wattage + " W y está " + (this.power ? "encendida." : "apagada.");
    }
}