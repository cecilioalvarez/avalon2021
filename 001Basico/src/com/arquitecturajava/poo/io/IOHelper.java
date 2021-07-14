package com.arquitecturajava.poo.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHelper {
    
    public static String askForText() {
        String string = null;
        boolean valid = false;
        do {
            System.out.print("Introduce el texto:\t");
            try {
                string = new Scanner(System.in).next();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return string;
    }
    
    public static int askForInt() {
        int number = 0;
        boolean valid = false;
        do {
            System.out.print("Introduce el número entero:\t");
            try {
                number = new Scanner(System.in).nextInt();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
    
    public static double askForDouble() {
        double number = 0;
        boolean valid = false;
        do {
            System.out.print("Introduce el número decimal:\t");
            try {
                number = new Scanner(System.in).nextDouble();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
}