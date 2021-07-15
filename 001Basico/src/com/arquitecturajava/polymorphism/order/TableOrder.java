package com.arquitecturajava.polymorphism.order;

class TableOrder extends Order {
    
    private static final double SURCHARGE = 10; // Plus en porcentaje.

    TableOrder(Client client, double price) {
        super(client, price);
    }

    @Override
    protected double getPriceIncludingParticularChannelCharges() {
        return this.price + this.price * SURCHARGE / 100;
    }
}