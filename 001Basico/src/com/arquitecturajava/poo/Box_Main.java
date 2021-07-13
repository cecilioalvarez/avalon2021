package com.arquitecturajava.poo;

public class Box_Main {

    public static void main(String[] args) {
        Box box1 = new Box(20, 20, 12.5);
        System.out.printf("El voumen de la caja es de %.2f m2.\n", box1.getVolume());
    }
}