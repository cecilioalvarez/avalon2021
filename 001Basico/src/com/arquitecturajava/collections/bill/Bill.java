package com.arquitecturajava.collections.bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Bill {

    private static int BILLS_COUNT = 0;
    private final int ID;
    private final String CONCEPT;
    private List <BillDetail> details = new ArrayList<>();
    
    Bill(String concept) {
        this.ID = ++Bill.BILLS_COUNT;
        this.CONCEPT = concept;
    }
    
    Bill(String concept, List<BillDetail> details) {
        this.ID = ++Bill.BILLS_COUNT;
        this.CONCEPT = concept;
        this.details = details;
    }

    int getID() {
        return this.ID;
    }

    String getCONCEPT() {
        return this.CONCEPT;
    }

    void setDetails(ArrayList<BillDetail> details) {
        this.details = details;
    }

    List<BillDetail> getDetails() {
        return this.details;
    }
    
    void addDetail(BillDetail ...details) {
        this.details.addAll(Arrays.asList(details));
    }
}