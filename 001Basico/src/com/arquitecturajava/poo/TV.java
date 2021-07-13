package com.arquitecturajava.poo;

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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
