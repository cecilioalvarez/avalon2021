package com.arquitecturajava.poo.inheritance_order;

class BarOrder extends Order {

    public BarOrder(double price) {
        super(price);
    }

    @Override
    double getTotalPrice() {
        return this.getPrice();
    }
}