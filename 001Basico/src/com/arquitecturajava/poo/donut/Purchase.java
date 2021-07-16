package com.arquitecturajava.poo.donut;

import java.util.ArrayList;

class Purchase {
    
    private final ArrayList<DonutPack> PRODUCTS = new ArrayList<>();

    private Purchase(Flavour flavour, PurchasePack purchasePack) {
        for (int i = 0; i < purchasePack.getDonutPackCount(); i++) {
            PRODUCTS.add(new DonutPack(flavour));
        }
    }
    
    private void showPrice() {
        double price = this.PRODUCTS.stream().mapToDouble(donutPack -> donutPack.getPrice()).sum();
        System.out.printf("El coste total de tu compra son %.2f €.\n", price);
    }
    
    public static void main(String[] args) {
        Purchase purchase = new Purchase(Flavour.CLASSIC, PurchasePack.MEGAPACK);
        purchase.showPrice();
        purchase = new Purchase(Flavour.VANILLA, PurchasePack.NORMAL);
        purchase.showPrice();
        purchase = new Purchase(Flavour.GLAZED, PurchasePack.NORMAL);
        purchase.showPrice();
        purchase = new Purchase(Flavour.CHOCOLATE, PurchasePack.MEGAPACK);
        purchase.showPrice();
    }
}