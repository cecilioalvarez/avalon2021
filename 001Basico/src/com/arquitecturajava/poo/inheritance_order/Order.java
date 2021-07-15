package com.arquitecturajava.poo.inheritance_order;

abstract class Order {

    protected static final int VIP_ORDER_COUNT_TRESHOLD = 5;
    protected static final double VIP_DISCOUNT = 25;
    private double price;
    private int nOrderForThisClient;

    public Order(Client client, double price) {
        this.nOrderForThisClient = client.getOrderCount() + 1;
        this.setPrice(price);
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
    
    private boolean isVip() {
        return this.nOrderForThisClient > Order.VIP_ORDER_COUNT_TRESHOLD;
    }
    
    protected double applyVipDiscount(double totalPrice) {
        return this.isVip() ? totalPrice - (totalPrice * Order.VIP_DISCOUNT / 100) : totalPrice;
    }
    
    protected abstract double getTotalPrice();
    
    double getDefinitivePrice() {
        return this.applyVipDiscount(this.getTotalPrice());
    }
}