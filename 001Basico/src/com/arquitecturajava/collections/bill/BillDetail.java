package com.arquitecturajava.collections.bill;

class BillDetail {

    private final int ID;
    private final String CONCEPT;
    private final float AMOUNT;

    BillDetail(int id, String concept, float amount) {
        this.ID = id;
        this.CONCEPT = concept;
        this.AMOUNT = amount;
    }

    int getID() {
        return this.ID;
    }

    String getCONCEPT() {
        return this.CONCEPT;
    }
    
    float getAMOUNT() {
        return this.AMOUNT;
    }

    @Override
    public String toString() {
        return "Línea " + this.ID + ". Concepto: " + this.CONCEPT + ". Importe: " + String.format("%.2f", this.AMOUNT) + " €.";
    }
}