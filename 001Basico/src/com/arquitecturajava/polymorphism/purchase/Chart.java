package com.arquitecturajava.polymorphism.purchase;

import java.util.ArrayList;

class Chart {
    
    private final ArrayList<Purchase> LIST;

    private Chart() {
        this.LIST = new ArrayList<>();
    }
    
    private void addPurchase(Purchase purchase) {
        this.LIST.add(purchase);
    }
    
    private void showTotalPrice() {
        double totalPrice = 0;
        for (Purchase purchase : this.LIST) {
           totalPrice += purchase.getTotalPrice();
        }
        System.out.printf("El importe total de las compras son %.2f €.\n", totalPrice);
    }
    
    private void showMostExpensivePurchase() {
        Purchase mostExpensivePurchase = null;
        for (Purchase purchase : this.LIST) {
            if (mostExpensivePurchase == null || purchase.getTotalPrice() > mostExpensivePurchase.getTotalPrice())
                mostExpensivePurchase = purchase;
        }
        System.out.printf("La compra más cara es de «" + mostExpensivePurchase.getProduct() 
                + "» con un coste de %.2f €.\n", mostExpensivePurchase.getTotalPrice());
    }

    public static void main(String[] args) {
        Chart chart = new Chart();
        chart.addPurchase(new StandardPurchase("Ruedas", 119.99));
        chart.addPurchase(new PrimePurchase("Aceite de motor", 39.99));
        chart.addPurchase(new StandardPurchase("Caja de cambios", 349.99));
        chart.addPurchase(new PrimePurchase("Asientos", 89.99));
        chart.addPurchase(new StandardPurchase("Matrículas", 39.99));
        chart.showTotalPrice();
        chart.showMostExpensivePurchase();
    }
}
