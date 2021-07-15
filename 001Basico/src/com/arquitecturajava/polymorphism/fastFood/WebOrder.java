package com.arquitecturajava.polymorphism.fastFood;

class WebOrder extends TelematicOrder {

    private String email;

    WebOrder(String client, String location, String email) {
        super(client, location);
        this.email = email;
    }

    @Override
    protected String getArrivalCommunicationMethod() {
        return "email a " + this.email;
    }

    @Override
    protected String getChannelDeliveryInfo() {
        return " " + this.getArrivalConfirmationMessage() + " y recibirás un email en " + this.email + " confirmando la entrega.";
    }
}