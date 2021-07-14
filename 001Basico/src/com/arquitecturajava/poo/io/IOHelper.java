package com.arquitecturajava.poo.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHelper {
    
    public static String askForText(String dataName) {
        String string = null;
        boolean valid = false;
        do {
            System.out.print("Introduce " + dataName + ":\t");
            try {
                string = new Scanner(System.in).next();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return string;
    }
    
    public static int askForInt(String dataName) {
        int number = 0;
        boolean valid = false;
        do {
            System.out.print("Introduce " + dataName + ":\t");
            try {
                number = new Scanner(System.in).nextInt();
                valid = true;
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
    
    public static double askForDouble(String dataName) {
        double number = 0;
        boolean valid = false;
        do {
            System.out.print("Introduce " + dataName + ":\t");
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