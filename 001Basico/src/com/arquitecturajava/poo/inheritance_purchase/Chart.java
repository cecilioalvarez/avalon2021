package com.arquitecturajava.poo.inheritance_purchase;

import java.util.ArrayList;

class Chart {
    
    private ArrayList<Purchase> list;

    private Chart() {
        this.list = new ArrayList<>();
    }
    
    void addPurchase(Purchase purchase) {
        this.list.add(purchase);
    }
    
    void showTotalPrice() {
        double totalPrice = 0;
        for (Purchase purchase : this.list) {
           totalPrice += purchase.getTotalPrice();
        }
        System.out.printf("El importe total de tu compra son %.2f €.\n", totalPrice);
    }

    public static void main(String[] args) {
        Chart chart = new Chart();
        chart.addPurchase(new StandardPurchase("Manuel", "Ruedas", 119.99));
        chart.addPurchase(new PrimePurchase("Manuel", "Ruedas", 149.99));
        chart.showTotalPrice();
    }
}
