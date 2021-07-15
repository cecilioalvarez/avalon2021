package com.arquitecturajava.polymorphism.fastFood;

class WebOrder extends TelematicOrder {

    private String email;

    public WebOrder(String client, String location, String email) {
        super(client, location);
        this.email = email;
    }

    @Override
    String getWelcomeMessage() {
        return super.getWelcomeMessage() + " Te enviaremos un e-mail a " + this.email + " cuando el repartidor llegue a " + this.location + ".";
    }

    @Override
    protected String getChannelDeliveryInfo() {
        return " " + this.getArrivalConfirmation() + " y recibirás un email en " + this.email + " para valorar la la experiencia.";
    }
}