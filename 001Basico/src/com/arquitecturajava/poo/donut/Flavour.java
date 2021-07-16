package com.arquitecturajava.poo.donut;

enum Flavour {
    CLASSIC(1),
    CHOCOLATE(1.2), 
    GLAZED(1.4),
    VANILLA(1.2);
    
    private double price;

    private Flavour(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}