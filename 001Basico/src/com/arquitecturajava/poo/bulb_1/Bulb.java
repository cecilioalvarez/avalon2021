package com.arquitecturajava.poo.bulb_1;

class Bulb {

    private int lumens;
    private boolean on;

    Bulb() {
        this.setOn(false);
        this.setLumens(0);
    }
    
    Bulb(boolean on) {
        this.setOn(on);
        this.setLumens(0);
    }

    Bulb(int lumens) {
        this.setOn(lumens);
    }

    int getLumens() {
        return this.lumens;
    }
    
    void setLumens(int lumens) {
        this.lumens = lumens;
    }

    boolean isOn() {
        return this.on;
    }
    
    // Apaga/endiende alternando el estado actual.
    void setOn() {
        this.on = !this.isOn();
    }

    // Apaga/enciende en función del parámetro recibido..
    void setOn(boolean on) {
        this.on = on;
    }
    
    // Enciende y establece la cantidad de lumens.
    void setOn(int lumens) {
        this.setOn(true);
        this.setLumens(lumens);
    }

    @Override
    public String toString() {
        return "La bombilla está " + (this.isOn() ? "encendida" : "apagada") + " y sus lumens configurados en " + this.getLumens() + ".";
    }
}