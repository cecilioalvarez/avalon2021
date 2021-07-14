package com.arquitecturajava.poo.bill;

public class FinancialMath {
    
    // IVA en porcentaje.
    private static final double VAT = 21;
    
    static double applyVAT(double price) {
        return price * (FinancialMath.VAT / 100 + 1);
    }
}