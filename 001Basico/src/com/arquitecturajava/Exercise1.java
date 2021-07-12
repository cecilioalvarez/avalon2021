package com.arquitecturajava;

import java.util.InputMismatchException;
import java.util.Scanner;

class Exercise1 {

    private static double askForDouble() {
        boolean valid = false;
        double number = 0;
        do {
            System.out.print("Introduce un número:\t");
            try {
                number = new Scanner(System.in).nextDouble();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
    
    private static void compareNumbers(double n1, double n2) {
        if (n1 > n2) {
            System.out.println("El mayor número es el primero: " + n1 + ".");
        } else if (n1 < n2) {
            System.out.println("El mayor número es el segundo: " + n2 + ".");
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    public static void main(String[] args) {
        Exercise1.compareNumbers(Exercise1.askForDouble(), Exercise1.askForDouble());
    }
}
