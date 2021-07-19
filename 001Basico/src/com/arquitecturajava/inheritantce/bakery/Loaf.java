package com.arquitecturajava.inheritantce.bakery;

class Loaf extends Bread {

    public Loaf(double weight, String[] ingredients) {
        super(weight, ingredients);
    }

    @Override
    String cook() {
        return "La hogaza se cocina a 250 ºC durante 120 minutos.";
    }
}