package com.arquitecturajava.ejerciciosbasicos;

public class HolaMundo16 {
    
    private static double bills[] = new double[3];
    
    public static void main(String[] args) {
        bills[0] = 135.85;
        bills[1] = 298.99;
        bills[2] = 87.00;
        
        for (int i = 0; i < bills.length; i++) {
            System.out.println(bills[i]);
        }
    }
}