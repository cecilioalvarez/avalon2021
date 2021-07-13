package com.arquitecturajava.ejerciciosbasicos;

import java.util.Scanner;

public class HolaMundo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame una nota");
        int numero = sc.nextInt();
        if (numero > 5 && numero < 7) {

            System.out.println("has aprobado");
            // operador logico && de and
        } else if (numero >= 7 && numero < 9) {
            System.out.println("notable");
        } else {
            System.out.println("sobresaliente");
        }

    }

}
