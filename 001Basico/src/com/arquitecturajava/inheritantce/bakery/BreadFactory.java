package com.arquitecturajava.inheritantce.bakery;

class BreadFactory {

    static Bread getBread(String type) {
        double weight = 200;
        String[] ingredients = {"Harina", "Sal", "Levadura", "Agua"};
        switch(type.toLowerCase()) {
            case "baguette":
                return new Baguette(weight, ingredients);
            case "hamburger":
                return new HamburgerBun(weight, ingredients);
            case "loaf":
                return new Loaf(weight, ingredients);
            default:
                return null;
        }
    }
}