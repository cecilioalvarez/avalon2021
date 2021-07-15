package com.arquitecturajava.inheritantce.computer;

public class ComputerManufacture {
    
    private static void showResetDelay(Computer computer) {
        System.out.println("El equipo tarda en reiniciar " + computer.getResetDelay() + " segundos.");
    }
    
    public static void main(String[] args) {
        ComputerManufacture.showResetDelay(new Computer("Asus", 1025.99));
        ComputerManufacture.showResetDelay(new Laptop(6500, "Dell", 699.99));
    }
}