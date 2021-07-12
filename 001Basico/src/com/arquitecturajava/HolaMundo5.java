package com.arquitecturajava;

public class HolaMundo5 {

    public static void main(String[] args) {

        int numero = 2;
        // es el operador or una opcion o la otra
        if (numero == 2 || numero == 4 || numero == 6 || numero == 8) {

            System.out.println("elnumero es par");
        }

        if (numero % 2 == 0) {

            System.out.println(numero);
        }
        // operador ternario
        System.out.println((numero > 5 ? "has aprobado" : "has suspendido"));

    }

}
