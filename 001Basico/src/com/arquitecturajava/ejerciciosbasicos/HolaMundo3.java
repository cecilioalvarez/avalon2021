package com.arquitecturajava.ejerciciosbasicos;

import java.util.Scanner;

public class HolaMundo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame una nota");
        int numero = sc.nextInt();
        if (numero > 5) {

            System.out.println("has aprobado");
        } else {
            System.out.println("has suspendido");
        }
    }
}
