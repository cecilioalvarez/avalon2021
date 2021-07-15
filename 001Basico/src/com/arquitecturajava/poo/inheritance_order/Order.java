package com.arquitecturajava.poo.inheritance_order;

abstract class Order {

    protected static final int VIP_ORDER_TRESHOLD = 5;
    protected static final double VIP_DISCOUNT = 25;
    private static int orderCount = 0;
    private int nOrder;
    private double price;

    public Order(double price) {
        this.nOrder = ++Order.orderCount;
        this.setPrice(price);
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
    
    private boolean isVip() {
        return this.nOrder > Order.VIP_ORDER_TRESHOLD;
    }
    
    protected double applyVipDiscount(double totalPrice) {
        return this.isVip() ? totalPrice - (totalPrice * Order.VIP_DISCOUNT / 100) : totalPrice;
    }
    
    abstract double getTotalPrice();
    
    double getDefinitivePrice() {
        return this.applyVipDiscount(this.getTotalPrice());
    }
}