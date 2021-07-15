package com.arquitecturajava.poo.inheritance_order;

class TableOrder extends Order {
    
    private static final double SURCHARGE = 10; // Plus en porcentaje.

    TableOrder(double price) {
        super(price);
    }

    @Override
    double getTotalPrice() {
        return this.getPrice() + this.getPrice() * SURCHARGE / 100;
    }
}