package com.arquitecturajava.poo.inheritance_purchase;

abstract class Purchase {
    
    private String client;
    private String product;
    private double price;

    Purchase(String client, String product, double price) {
        this.setClient(client);
        this.setProduct(product);
        this.setPrice(price);
    }

    String getClient() {
        return this.client;
    }

    void setClient(String client) {
        this.client = client;
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
    
    double getTotalPrice() {
        return this.getPrice();
    }
}