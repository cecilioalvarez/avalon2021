package com.arquitecturajava.polymorphism.fastFood;

abstract class Order {

    private static int orderCount = 0;
    private int id;
    private String client;

    Order(String client) {
        this.id = ++Order.orderCount; // Aumentamos el contador de la clase antes de asignar el ID al pedido instanciado.
        this.client = client;
    }
    
    /* 
     * Para el mensaje de bienvenida cuando se genera el pedido, optamos por darle cuerpo al método en la clase padre 
     * y sobeescribirlo en las clases hijas.
     */
    String getWelcomeMessage() {
        return this.client + ", tu pedido es el nº " + this.id + " y está siendo procesado.";
    }
    
    /* 
     * Para el mensaje de conformación cuando el pedido esté listo, optamos por obligar a las clases hijas a devolver la 
     * información específica en su caso con un método abstracto, al que llamamos desde otro método declarado 
     * en la clase padre.
     */
    protected abstract String getChannelDeliveryInfo();
    
    String getDeliveryMessage() {
        return this.client + ", tu pedido [nº " + this.id + "] está listo." + this.getChannelDeliveryInfo();
    }

    // Dos pedidos se consideran iguales si su atributo ID es el mismo.
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}