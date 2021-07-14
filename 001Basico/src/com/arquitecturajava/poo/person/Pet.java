package com.arquitecturajava.poo.person;

class Pet {

    private String name;
    private Illness illness;

    Pet() {
        this.setName("Sin nombre");
        this.setIllness(new Illness());
    }

    Pet(String name, Illness illness) {
        this.setName(name);
        this.setIllness(illness);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Illness getIllness() {
        return this.illness;
    }

    void setIllness(Illness illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "La mascota se llama " + this.getName() + " y " 
                + (this.illness == null ? "no está enferma." : "está enferma de " + this.getIllness().getName() + " con gravedad " + this.getIllness().getExtent().getName() + ".");
    }
    
    
}
