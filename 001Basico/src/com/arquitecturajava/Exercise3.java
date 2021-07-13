package com.arquitecturajava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {

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
    
    private static void showMultiplicationTable(int number) {
        System.out.println("A continuación se muestra la tabla de multiplicar del número " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
    
    public static void main(String[] args) {
        Exercise3.showMultiplicationTable(Exercise3.askForInteger());
    }
}
