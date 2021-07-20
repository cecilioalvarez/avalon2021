package com.arquitecturajava.apis.wrapper;

class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + ": " + String.format("%.2f", this.price) + " €";
    }
}