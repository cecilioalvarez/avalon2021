package com.arquitecturajava.poo.inheritance_purchase;

class StandardPurchase extends Purchase {
    
    private int nPurchase;
    private static final double SHIPPING_COSTS = 10;
    private static final double FIRST_PURCHASE_DISCOUNT = 50;
    private static int purchaseCounter = 0;

    public StandardPurchase(String product, double price) {
        super(product, price);
        this.nPurchase = ++StandardPurchase.purchaseCounter;
    }

    int getnPurchase() {
        return nPurchase;
    }
    
    @Override
    double getTotalPrice() {
        return this.getStandardPrice();
    }
    
    double getStandardPrice() {
        double finalPrice = this.getPrice() + StandardPurchase.SHIPPING_COSTS;
        return this.getnPurchase() == 1 ? finalPrice - StandardPurchase.FIRST_PURCHASE_DISCOUNT : finalPrice;
    }
}