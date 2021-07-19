package com.arquitecturajava.collections.bill;

class BillDetail {

    private int id;
    private String concept;
    private double amount;

    public BillDetail(int id, String concept, double amount) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
    }

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getConcept() {
        return this.concept;
    }

    void setConcept(String concept) {
        this.concept = concept;
    }

    double getAmount() {
        return this.amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Línea " + this.id + ". Concepto: " + this.concept + ". Importe: " + this.amount + " €.";
    }
}