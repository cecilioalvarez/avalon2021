package com.arquitecturajava.interfaces.bulb;

class Tv implements Connectable {
    
    private boolean power;

    Tv() {
        this.power = false;
    }

    Tv(boolean power) {
        this.power = power;
    }

    @Override
    public boolean isOn() {
        return this.power;
    }

    @Override
    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "El televisor está " + (this.isOn() ? "encendido." : "apagado.");
    }
}