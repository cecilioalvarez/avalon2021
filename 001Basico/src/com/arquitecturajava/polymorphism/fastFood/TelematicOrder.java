package com.arquitecturajava.polymorphism.fastFood;

abstract class TelematicOrder extends Order {

    private String location;

    TelematicOrder(String client, String location) {
        super(client);
        this.location = location;
    }
    
    /* 
     * Obligamos a las clases hijas a que indiquen el canal de comunicación con el cliente durante el envío. De esta 
     * forma, podamos formar un mensaje común a toas las clases hijas sin necesidad de implementarlo al completo 
     * en ellas; requiriendo únicamente la parte variable del mismo.
     */
    protected abstract String getArrivalCommunicationMethod();

    @Override
    String getWelcomeMessage() {
        return super.getWelcomeMessage() + " Te avisaremos mediante " + this.getArrivalCommunicationMethod() 
                + " cuando el repartidor llegue a " + this.location + ".";
    }
    
    /*
     * Para el mensaje de confirmación de envío, optamos por generar la parte común en la clase padre y cumplir 
     * con el principio DRY. Al no sobreescribir el método abstracto getChannelDeliveryInfo(), delegamos su 
     * implementación en las clases hijas, por lo que estas serán las encargadas de componer dicho mensaje.
     */
    protected String getArrivalConfirmationMessage() {
        return "El repartidor llegó a " + this.location;
    }
}