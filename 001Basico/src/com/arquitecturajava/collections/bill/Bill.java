package com.arquitecturajava.collections.bill;

import java.util.ArrayList;
import java.util.Arrays;

class Bill {

    private static int BILLS_COUNT = 0;
    private final int ID;
    private final String CONCEPT;
    private ArrayList<BillDetail> details = new ArrayList<>();
    
    Bill(String concept) {
        this.ID = ++Bill.BILLS_COUNT;
        this.CONCEPT = concept;
    }
    
    Bill(String concept, ArrayList<BillDetail> details) {
        this.ID = ++Bill.BILLS_COUNT;
        this.CONCEPT = concept;
        this.details = details;
    }

    int getID() {
        return this.ID;
    }

    public String getCONCEPT() {
        return this.CONCEPT;
    }

    public void setDetails(ArrayList<BillDetail> details) {
        this.details = details;
    }

    public ArrayList<BillDetail> getDetails() {
        return this.details;
    }
    
    void addDetail(BillDetail ...details) {
        this.details.addAll(Arrays.asList(details));
    }
}