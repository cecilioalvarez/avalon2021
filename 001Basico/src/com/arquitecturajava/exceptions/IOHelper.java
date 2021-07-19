package com.arquitecturajava.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class IOHelper {

    static int askForInteger(String dataName, int min, int max) {
        int number = min - 1;
        boolean valid = false;
        do {
            System.out.println("Por favor, introduce " + dataName + ":");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                if (!IOHelper.validateInteger(number, min, max)) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime_ex) {
                System.err.println("El valor introducido debe ser un número entero entre " + min + " y " + max + ": " + ime_ex.getMessage());
            } finally {
                scanner.close();
            }
        } while (!valid);
        return number;
    }
    
    private static boolean validateInteger(int value, int min, int max) {
        return min <= value && value <= max;
    }
    
    static File createFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException io_ex) {
            System.out.println("Error al intentar crear el fichero en la ruta indicada: " + io_ex.getMessage());
        }
        return file;
    }
}