package com.arquitecturajava.poo.bill;

public class FinancialMath {
    
    private static final double VAT = 21; // IVA en porcentaje.
    
    static double applyVAT(double price) {
        return price * (FinancialMath.VAT / 100 + 1);
    }
}