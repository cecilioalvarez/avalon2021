package com.arquitecturajava.poo.inheritance_order;

abstract class Order {

    protected static final int VIP_ORDER_COUNT_TRESHOLD = 5;
    protected static final double VIP_DISCOUNT = 25;
    protected double price;
    private int nOrderForThisClient;

    public Order(Client client, double price) {
        this.nOrderForThisClient = client.getOrderCount() + 1;
        this.price = price;
    }
    
    private boolean isVip() {
        return this.nOrderForThisClient > Order.VIP_ORDER_COUNT_TRESHOLD;
    }
    
    // Cada clase hija calcula el precio del pedido con los decuentos y recargos propios.
    protected abstract double getPriceIncludingParticularChannelCharges();
    
    /* Una vez aplicados los descuentos propios de la clase hija, se pasan como parámetro a este método 
    para que aplique o no el descuento VIP. */
    private double applyVipDiscount(double totalPrice) {
        return this.isVip() ? totalPrice - (totalPrice * Order.VIP_DISCOUNT / 100) : totalPrice;
    }
    
    /* Método que nos devuelve el precio definitivo del pedido: Llama al método de esta clase que aplica el 
    descuento VIP –si procede–, y ese ya recibe a su vez recibe el precio dependiendo del canal. */
    double getDefinitivePriceIncludingVipDiscount() {
        return this.applyVipDiscount(this.getPriceIncludingParticularChannelCharges());
    }
}