package com.arquitecturajava.poo.tv;

public class TV {

    private String brand;
    private double price;
    private boolean on;

    public TV() {
    }

    public TV(String brand, double price, boolean on) {
        this.brand = brand;
        this.price = price;
        this.on = on;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    
    public double getVAT() {
        return this.price - this.price / 1.21;
    }
}
