package com.arquitecturajava.sql.phone;

class Phone {

    private int pk_number;
    private String brand;
    private double price;

    Phone() {
    }
    
    Phone(int number, String brand, double price) {
        this.pk_number = number;
        this.brand = brand;
        this.price = price;
    }

    int getPk_number() {
        return this.pk_number;
    }

    void setPk_number(int pk_number) {
        this.pk_number = pk_number;
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

    @Override
    public String toString() {
        return "[" + this.pk_number + "] " + this.brand + " -> " + String.format("%.2f", this.price) + " €.";
    }
}