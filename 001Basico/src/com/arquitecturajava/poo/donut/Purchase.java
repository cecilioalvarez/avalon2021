package com.arquitecturajava.poo.donut;

import java.util.ArrayList;

class Purchase {
    
    private static final int PURCHASE_PACK_COUNT = 3;
    private ArrayList<DonutPack> megapack = new ArrayList<>();

    private Purchase(Flavour flavour) {
        for (int i = 0; i < Purchase.PURCHASE_PACK_COUNT; i++) {
            megapack.add(new DonutPack(flavour));
        }
    }
    
    private void showPrice() {
        double price = this.megapack.stream().mapToDouble(donutPack -> donutPack.getPrice()).sum();
        System.out.printf("El coste total del pack es de %.2f €.\n", price);
    }
    
    public static void main(String[] args) {
        Purchase purchase = new Purchase(Flavour.CLASSIC);
        purchase.showPrice();
    }
}