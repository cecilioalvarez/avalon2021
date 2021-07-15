package com.arquitecturajava.poo.bill;

import java.util.Formatter;

class Bill {
    
    private static int billCount = 0;
    private int id;
    private String concept;
    private double price;

    Bill() {
        this.id = ++billCount;
    }

    Bill(String concept, double price) {
        this.id = ++billCount;
        this.setConcept(concept);
        this.setPrice(price);
    }

    int getId() {
        return this.id;
    }

    String getConcept() {
        return this.concept;
    }

    void setConcept(String concept) {
        this.concept = concept;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }
    
    double getPriceIncludingVAT() {
        return FinancialMath.applyVAT(this.getPrice());
    }
    
    // Descuento en porcentaje.
    double getPriceWithDiscount(double discount) {
        return this.price * (100 - discount)/100;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);
        return formatter.format("El precio de la factura nº " + this.getId() + " con concepto «" + this.getConcept() + "» es de %.2f € sin IVA.", this.getPrice()).toString();
    }
}