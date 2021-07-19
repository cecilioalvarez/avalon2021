package com.arquitecturajava.inheritantce.bakery;

import java.util.ArrayList;
import java.util.Arrays;

class Bakery {
    
    private final ArrayList<Bread> BREADS = new ArrayList<>();
    
    private void addBreads(Bread ...breads) {
        this.BREADS.addAll(Arrays.asList(breads));
    }
    
    private void showBreadsInfo() {
        this.BREADS.forEach(bread -> System.out.println(bread.cook()));
    }

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.addBreads(
            BreadFactory.getBread("baguette"),
            BreadFactory.getBread("hamburger"),
            BreadFactory.getBread("loaf")
        );
        bakery.showBreadsInfo();
    }
}