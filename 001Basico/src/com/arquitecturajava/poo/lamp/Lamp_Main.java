package com.arquitecturajava.poo.lamp;

public class Lamp_Main {

    public static void main(String[] args) {
        
        Lamp lamp1 = new Lamp("Philips");
        System.out.println("La lámpara de marca " + lamp1.getBrand() + " está " + (lamp1.isOn() ? "encendida." : "apagada."));
        lamp1.setOn(5);
        System.out.println("La lámpara de marca " + lamp1.getBrand() + " está " + (lamp1.isOn() ? "encendida" : "apagada") + " a " + lamp1.getLumens() + " lumens.");
    }
}