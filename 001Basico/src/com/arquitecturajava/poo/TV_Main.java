package com.arquitecturajava.poo;

public class TV_Main {

    public static void main(String[] args) {
        TV tv1 = new TV("Philips", 359.99, false);
        TV tv2 = new TV("LG", 429.99, true);
        
        System.out.printf("El televisor de la marca " + tv1.getBrand() + " costaba %.2f €.\n", tv1.getPrice());
        tv1.setPrice(849.99);
        System.out.printf("El televisor de la marca " + tv1.getBrand() + " ahora cuesta %.2f €.\n", tv1.getPrice());
        
        System.out.println("El televisor de la marca " + tv2.getBrand() + " estaba " + (tv2.isOn() ? "encendido." : "apagado."));
        tv2.setOn(false);
        System.out.println("El televisor de la marca " + tv2.getBrand() + " ahora está " + (tv2.isOn() ? "encendido." : "apagado."));
    }
}