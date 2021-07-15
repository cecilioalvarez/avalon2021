package com.arquitecturajava.poo.inheritance_order;

class TableOrder extends Order {
    
    private static final double SURCHARGE = 10; // Plus en porcentaje.

    TableOrder(Client client, double price) {
        super(client, price);
    }

    @Override
    protected double getTotalPrice() {
        return this.getPrice() + this.getPrice() * SURCHARGE / 100;
    }
}