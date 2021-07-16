package com.arquitecturajava.poo.donut;

enum PurchasePack {
    NORMAL(1),
    MEGAPACK(3);

    private int donutPackCount;

    PurchasePack(int donutPackCount) {
        this.donutPackCount = donutPackCount;
    }

    int getDonutPackCount() {
        return donutPackCount;
    }
}
