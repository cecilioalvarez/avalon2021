package com.arquitecturajava.inheritantce.bakery;

class Baguette extends Bread {

    Baguette(double weight, String[] ingredients) {
        super(weight, ingredients);
    }

    @Override
    String cook() {
        return "La baguette se cocina a fuego lento durante 60 minutos.";
    }
}