package com.arquitecturajava.polymorphism.fastFood;

class PhoneOrder extends TelematicOrder {

    private int number;

    PhoneOrder(String client, String location, int number) {
        super(client, location);
        this.number = number;
    }

    @Override
    protected String getArrivalCommunicationMethod() {
        return "SMS al " + this.number;
    }

    @Override
    protected String getChannelDeliveryInfo() {
        return  " " + this.getArrivalConfirmationMessage() + " y te enviará un SMS en breve al "+ this.number + ".";
    }
}