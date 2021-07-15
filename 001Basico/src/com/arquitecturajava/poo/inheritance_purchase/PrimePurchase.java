package com.arquitecturajava.poo.inheritance_purchase;

public class PrimePurchase extends Purchase {

    public PrimePurchase(String product, double price) {
        super(product, price);
    }

    @Override
    double getTotalPrice() {
        return this.getPrice();
    }
}