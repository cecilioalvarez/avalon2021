package com.arquitecturajava.poo.inheritance_computer;

class Laptop extends Computer {
    
    private static final int RESET_DELAY = 12;
    private int battery;

    Laptop(int battery, String brand, double price) {
        super(brand, price);
        this.setBattery(battery);
    }

    int getBattery() {
        return this.battery;
    }

    void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    int getResetDelay() {
        return Laptop.RESET_DELAY;
    }
}