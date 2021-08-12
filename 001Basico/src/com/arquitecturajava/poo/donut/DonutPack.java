package com.arquitecturajava.poo.donut;

class DonutPack {

    private static final int DONUTS_PER_PACK = 2;
    private Flavour flavour;
    
    DonutPack(Flavour flavour) {
        this.flavour = flavour;
    }
    
    double getPrice() {
        return this.flavour.getPrice() * DONUTS_PER_PACK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DonutPack other = (DonutPack) obj;
        if (this.flavour != other.flavour) {
            return false;
        }
        return true;
    }
}