package com.arquitecturajava.interfaces.bulb;

class Bulb implements Connectable {

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
    
    int getWattage() {
        return this.wattage;
    }
    
    @Override
    public boolean isOn() {
        return this.power;
    }
    
    @Override
    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bulb other = (Bulb) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "La bombilla nº " + this.id + " tiene una potencia de " + this.wattage + " W (vatios) y está " + (this.power ? "encendida." : "apagada.");
    }
}