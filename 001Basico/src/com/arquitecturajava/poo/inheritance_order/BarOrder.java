package com.arquitecturajava.poo.inheritance_order;

class BarOrder extends Order {

    public BarOrder(Client client, double price) {
        super(client, price);
    }

    @Override
    protected double getTotalPrice() {
        return this.getPrice();
    }
}