package com.arquitecturajava.ejemplos20;

public class Objetos20 {
public static void main(String[] args) {
	
	PackDonuts pack= new PackDonuts("chocolate", 2);
	System.out.println(pack.getDonut1().getSabor());
	System.out.println(pack.getDonut2().getSabor());
	System.out.println(pack.getPrecio());
	pack.setSabor("fresa");
	System.out.println(pack.getDonut1().getSabor());
	System.out.println(pack.getDonut2().getSabor());
	System.out.println(pack.getSabor());
}
}
