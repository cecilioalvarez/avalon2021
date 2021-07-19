package com.arquitecturajava.inheritantce.bakery;

class HamburgerBun extends Bread {

    public HamburgerBun(double weight, String[] ingredients) {
        super(weight, ingredients);
    }

    @Override
    String cook() {
        return "El pan de hamburguesa se cocina a 180 ºC durante 150 minutos.";
    }
}