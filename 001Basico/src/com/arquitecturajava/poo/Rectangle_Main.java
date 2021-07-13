package com.arquitecturajava.poo;

public class Rectangle_Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.printf("El área del rectángulo es de %.2f m2.\n", r1.getArea());
        System.out.printf("La longitud del rectángulo es de %.2f m.\n", r1.getLength());
    }
}