package com.arquitecturajava.poo.bill;

public class Bill {
    
    private static int billCount = 0;
    private int id;
    private String concept;
    private double price;

    public Bill() {
        this.id = ++billCount;
    }

    public Bill(String concept, double price) {
        this.id = ++billCount;
        this.concept = concept;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return this.concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPriceIncludingVAT() {
        return this.price * 1.21;
    }
    
    public double getPriceWithDiscount(double discount) {
        return this.price * (100 - discount)/100;
    }
}