package com.arquitecturajava.poo.box;

public class Box_Main {

    public static void main(String[] args) {
        Box box1 = new Box(20, 20, 12.5);
        System.out.printf("El voumen de la caja es de %.2f cm2.\n", box1.getVolume());
        Box minVolBox = box1.getMinVolumeBox();
        System.out.printf("La caja cabe en un espacio mínimo de %.2f cm de ancho, %.2f cm de alto y %.2f cm de profundidad.\n", 
                minVolBox.getWidth(), minVolBox.getHeight(), minVolBox.getDepth());
    }
}