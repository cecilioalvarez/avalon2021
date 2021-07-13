package com.arquitecturajava.ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Germán Zunzunegui
 * @version 1.0
 */
public class HolaMundo8 {
    
    private static String askForSomething(String question) {
        System.out.print(question + "\t");
        return new Scanner(System.in).next();
    }
    
    private static void showReaction(String day) {
        switch(day.toLowerCase()) {
            case "lunes":
                System.out.println("Primer día de la semana.");
                break;
            case "martes":
                System.out.println("El día más duro.");
                break;
            case "sábado": case "domingo":
                System.out.println("Descanso.");
                break;
            case "viernes":
                System.out.println("¡Ya casi está!.");
                break;
            default:
                System.out.println("Un día sin más.");
        }
    }

    public static void main(String[] args) {
        HolaMundo8.showReaction(HolaMundo8.askForSomething("Introduce un día de la semana:"));
    }
}