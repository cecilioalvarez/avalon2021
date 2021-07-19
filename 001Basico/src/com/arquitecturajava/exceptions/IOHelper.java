package com.arquitecturajava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class IOHelper {
    
    static String askForString(String dataName, int minLength, int maxLength) throws StringLengthValidationException {
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
                    throw new StringLengthValidationException(minLength, maxLength);
                }
            } catch (StringLengthValidationException str_ex) {
                throw str_ex;
            }
        } while (!valid);
        return answer;
    }

    static int askForInteger(String dataName, int min, int max) {
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
                    throw new IntegerValidationException(min, max);
                }
            } catch (IntegerValidationException val_ex) {
                System.err.println(val_ex.getMessage());
            }
        } while (!valid);
        return number;
    }
    
    private static boolean validate(int value, int min, int max) {
        return min <= value && value <= max;
    }
}

class IntegerValidationException extends InputMismatchException {
    
    private final int MIN;
    private final int MAX;
    
    IntegerValidationException(int min, int max) {
        this.MIN = min;
        this.MAX = max;
    }
    
    @Override
    public String getMessage() {
        return "El valor debe ser un número entero entre " + this.MIN + " y " + this.MAX + ".";
    }
}

class StringLengthValidationException extends InputMismatchException {
    
    private final int MIN;
    private final int MAX;
    
    StringLengthValidationException(int min, int max) {
        this.MIN = min;
        this.MAX = max;
    }
    
    @Override
    public String getMessage() {
        return "El texto debe tener una longitud comprendida entre " + this.MIN + " y " + this.MAX + " caracteres.";
    }
}