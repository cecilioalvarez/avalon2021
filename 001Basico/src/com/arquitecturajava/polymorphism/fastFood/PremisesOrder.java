package com.arquitecturajava.polymorphism.fastFood;

public class PremisesOrder extends Order {

    public PremisesOrder(String client) {
        super(client);
    }

    @Override
    protected String getChannelDeliveryInfo() {
        return " Puedes acercarte por el mostrador a recogerlo cuando quieras.";
    }

    @Override
    String getWelcomeMessage() {
        return super.getWelcomeMessage() + " Te llamaremos al mostrador cuando tu pedido esté listo.";
    }
}