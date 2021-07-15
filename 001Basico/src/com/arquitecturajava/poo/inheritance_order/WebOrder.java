package com.arquitecturajava.poo.inheritance_order;

public class WebOrder extends Order {

    private static final double DISCOUNT = 20; // Descuento en porcentaje.

    WebOrder(Client client, double price) {
        super(client, price);
    }

    @Override
    protected double getTotalPrice() {
        return this.getPrice() - this.getPrice() * DISCOUNT / 100;
    }
}