package com.arquitecturajava.poo.inheritance_purchase;

abstract class Purchase {
    
    private String product;
    private double price;

    Purchase(String product, double price) {
        this.setProduct(product);
        this.setPrice(price);
    }

    String getProduct() {
        return this.product;
    }

    void setProduct(String product) {
        this.product = product;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }
    
    abstract double getTotalPrice();
}