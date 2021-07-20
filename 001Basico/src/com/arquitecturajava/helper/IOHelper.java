package com.arquitecturajava.helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHelper {
    
    public static String askForString(String dataName, int minLength, int maxLength) {
        String answer = null;
        boolean valid = false;
        do {
            System.out.print("Por favor, introduce " + dataName + ":\t");
            Scanner scanner = new Scanner(System.in);
            try {
                answer = scanner.next();
                if (IOHelper.validate(answer.length(), minLength, maxLength)) {
                    valid = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime_ex) {
                System.err.println("La longitud del " + dataName + " debe estar comprendida entre " 
                        + minLength + " y " + maxLength + " caracteres.");;
            }
        } while (!valid);
        return answer;
    }

    public static int askForInteger(String dataName, int min, int max) {
        int number = min - 1;
        boolean valid = false;
        do {
            System.out.print("Por favor, introduce " + dataName + ":\t");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                if (IOHelper.validate(number, min, max)) {
                    valid = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime_ex) {
                System.err.println("El valor de " + dataName + " debe ser un número entero comprendido entre " + min + " y " + max + ".");
            }
        } while (!valid);
        return number;
    }
    
    public static double askForDoubleString(String dataName, double min, double max) {
        double number = min - 1;
        boolean valid = false;
        do {
            System.out.print("Por favor, introduce " + dataName + ":\t");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextDouble();
                if (IOHelper.validate(number, min, max)) {
                    valid = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime_ex) {
                System.err.println("El valor de " + dataName + " debe ser un número entero comprendido entre " + min + " y " + max + ".");
            }
        } while (!valid);
        return number;
    }
    
    private static boolean validate(double value, double min, double max) {
        return min <= value && value <= max;
    }
}