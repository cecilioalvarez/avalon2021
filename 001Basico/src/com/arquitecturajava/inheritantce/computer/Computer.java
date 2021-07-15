package com.arquitecturajava.inheritantce.computer;

class Computer {
    
    private static final int RESET_DELAY = 8;
    
    private String brand;
    private double price;
    boolean on;

    Computer(String brand, double price) {
        this.setBrand(brand);
        this.setPrice(price);
        this.setOn(false);
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    boolean isOn() {
        return this.on;
    }

    void setOn(boolean on) {
        this.on = on;
    }
    
    int getResetDelay() {
        return Computer.RESET_DELAY;
    }
}