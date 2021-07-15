package com.arquitecturajava.polymorphism.fastFood;

public class PhoneOrder extends TelematicOrder {

    private int number;

    PhoneOrder(String client, String location, int number) {
        super(client, location);
        this.number = number;
    }

    @Override
    String getWelcomeMessage() {
        return super.getWelcomeMessage() + " Te aviaremos mediante SMS al " + this.number + " cuando el repartidor llegue a " + this.location + ".";
    }

    @Override
    protected String getChannelDeliveryInfo() {
        return  " " + this.getArrivalConfirmation() + " y te enviará un SMS en breve al "+ this.number + ".";
    }
}