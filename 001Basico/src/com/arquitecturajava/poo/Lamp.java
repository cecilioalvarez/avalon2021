package com.arquitecturajava.poo;

public class Lamp {

    private String brand;
    private int lumens;
    private boolean on;

    public Lamp() {
        this.setOn(false);
        this.setLumens(0);
    }
    
    public Lamp(String brand) {
        this.setBrand(brand);
        this.setOn(false);
        this.setLumens(0);
    }

    Lamp(String brand, int lumens, boolean on) {
        this.setBrand(brand);
        this.setLumens(lumens);
        this.setOn(on);
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
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

    void setOn(boolean on) {
        this.on = on;
    }
    
    void setOn(int lumens) {
        this.setOn(true);
        this.setLumens(lumens);
    }
}