package com.arquitecturajava.collections.bill;

import java.util.HashMap;

class BillDetail {

    private static final HashMap<Bill, Integer> BILL_DETAIL_COUNT = new HashMap();
    private final int ID;
    private final String CONCEPT;
    private final float AMOUNT;
    private final Bill BILL;

    BillDetail(String concept, float amount, Bill bill) {
        BILL_DETAIL_COUNT.putIfAbsent(bill, 0);
        BILL_DETAIL_COUNT.put(bill, BILL_DETAIL_COUNT.get(bill) + 1);
        this.ID = BILL_DETAIL_COUNT.get(bill);
        this.CONCEPT = concept;
        this.AMOUNT = amount;
        this.BILL = bill;
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
    
    Bill getBill() {
        return this.BILL;
    }

    @Override
    public String toString() {
        return "\tLínea " + this.ID + ".\tConcepto: " + this.CONCEPT + ".\tImporte: " + String.format("%.2f", this.AMOUNT) + " €.";
    }
}