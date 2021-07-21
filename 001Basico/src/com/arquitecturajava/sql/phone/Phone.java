package com.arquitecturajava.sql.phone;

import com.arquitecturajava.helper.Helper;

class Phone {

    private int pk_number;
    private String brand;
    private double price;

    Phone() {
    }
    
    Phone(int number) {
        this.pk_number = number;
    }
    
    Phone(String brand) {
        this.pk_number = Helper.getRandomInteger(600000000, 799999999);
        this.brand = brand;
        this.price = Helper.getRandomInteger(69, 1399) + 0.99;
    }
    
    Phone(String brand, double price) {
        this.pk_number = Helper.getRandomInteger(600000000, 799999999);
        this.brand = brand;
        this.price = price;
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