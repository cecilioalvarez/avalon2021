package com.arquitecturajava.poo.factoryMethod;

abstract class Baby {

    private String name;
    private Gender gender;

    public Baby(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " es " + this.gender.getAlias();
    }
    
    abstract String pee();
}