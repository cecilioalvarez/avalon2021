package com.arquitecturajava.poo.factoryMethod;

class Girl extends Baby {

    Girl(String name) {
        super(Gender.GIRL, name);
    }

    @Override
    String pee() {
        return this.toString() + " y se sienta para hacer pis.";
    }
}