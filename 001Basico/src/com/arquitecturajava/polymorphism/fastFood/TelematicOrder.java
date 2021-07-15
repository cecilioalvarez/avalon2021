package com.arquitecturajava.polymorphism.fastFood;

abstract class TelematicOrder extends Order {

    protected String location;

    TelematicOrder(String client, String location) {
        super(client);
        this.location = location;
    }
    
    protected String getArrivalConfirmation() {
        return "El repartidor llegó a " + this.location;
    }
}