package com.arquitecturajava.poo.factoryMethod;

class BabyFactory {

    static Baby getBaby(Gender gender, String name) {
        switch (gender) {
            case BOY:
                return new Boy(name);
            case GIRL:
                return new Girl(name);
            default:
                return null;
        }
    }
}