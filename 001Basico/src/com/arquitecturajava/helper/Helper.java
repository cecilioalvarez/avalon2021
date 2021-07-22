package com.arquitecturajava.helper;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Helper {
    
    private static final Random RANDOM = new Random();
    
    public static String askForString(String dataName, int minLength, int maxLength) {
        String answer = null;
        boolean valid = false;
        do {
            System.out.print("Por favor, introduce " + dataName + ":\t");
            Scanner scanner = new Scanner(System.in);
            try {
                answer = scanner.next();
                if (Helper.validate(answer.length(), minLength, maxLength)) {
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
                if (Helper.validate(number, min, max)) {
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
                if (Helper.validate(number, min, max)) {
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
    
    public static int getRandomInteger(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
    
    public static double getRandomDouble(double min, double max) {
        return min + (RANDOM.nextDouble()  * (max - min)) ;
    }
}