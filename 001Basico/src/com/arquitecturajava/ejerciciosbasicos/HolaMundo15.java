package com.arquitecturajava.ejerciciosbasicos;

import java.util.InputMismatchException;
import java.util.Scanner;

class HolaMundo15 {
    
    private static int askForInteger() {
        boolean valid = false;
        int number = 0;
        do {
            System.out.print("Introduce un número entero:\t");
            try {
                number = new Scanner(System.in).nextInt();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
    
    private static double sum(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        HolaMundo15.sum(HolaMundo15.askForInteger(), HolaMundo15.askForInteger());
    }
}