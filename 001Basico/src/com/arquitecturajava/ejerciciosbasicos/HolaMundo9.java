package com.arquitecturajava.ejerciciosbasicos;

/**
 *
 * @author Germán Zunzunegui
 * @version 1.0
 */
public class HolaMundo9 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }
        
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);
    }
}