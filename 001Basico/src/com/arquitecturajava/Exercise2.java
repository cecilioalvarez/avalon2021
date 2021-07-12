package com.arquitecturajava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    
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
    
    private static boolean checkEvenInteger(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("El número es " + (Exercise2.checkEvenInteger(Exercise2.askForInteger()) ? "par." : "impar."));
    }
}
