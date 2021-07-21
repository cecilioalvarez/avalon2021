package com.arquitecturajava.sql.product;

class Product {

    private int pk_id;
    private String name;
    private double price;

    Product(int pk_id, String name, double price) {
        this.pk_id = pk_id;
        this.name = name;
        this.price = price;
    }
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    Product(int pk_id) {
        this.pk_id = pk_id;
    }
    
    Product() {
    }

    int getPk_id() {
        return pk_id;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "[" + this.pk_id + "] " + this.name + " -> " + String.format("%.2f", this.price) + " €.";
    }
}