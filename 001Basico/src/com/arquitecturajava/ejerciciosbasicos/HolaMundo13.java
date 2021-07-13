package com.arquitecturajava.ejerciciosbasicos;

import java.util.InputMismatchException;
import java.util.Scanner;

class HolaMundo13 {
    
    private static int askForInteger() {
        boolean valid = false;
        int number = 0;
        do {
            System.out.print("Introduce un número entero:\t");
            try {
                number = new Scanner(System.in).nextInt();
                valid = HolaMundo13.validateNumber(number, 1, 50);
            } catch (InputMismatchException ime_ex) {
                System.err.println("Error en la entrada de datos.");
            }
        } while (!valid);
        return number;
    }
    
    private static boolean validateNumber(int number, int min, int max) {
        return min >= number && number <= max;
    }
    
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        
        int[] lottery = new int[6];
        
        for (int i = 0; i < 5; i++) {
            lottery[i] = HolaMundo13.askForInteger();
        }
        
        System.out.println("Tus números de lotería:");
        for (int i = 0; i < lottery.length; i++) {
            System.out.println(lottery[i]);
        }
        
        System.out.println("Ahora solo los números pares:");
        for (int i = 0; i < lottery.length; i++) {
            if (HolaMundo13.isEven(lottery[i])) {
                System.out.println(lottery[i]);
            }
        }
    }
}