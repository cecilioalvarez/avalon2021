package com.arquitecturajava.poo.factoryMethod;

class Boy extends Baby {

    Boy(String name) {
        super(Gender.BOY, name);
    }

    @Override
    String pee() {
        return this.toString() + " y hace pis de pie.";
    }
}