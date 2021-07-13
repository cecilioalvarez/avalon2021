package com.arquitecturajava.ejemplos9;

public class Objetos9 {

	public static void main(String[] args) {
		String cadena = new String("hola");
		System.out.println(cadena);
		String cadena2 = "hola2";
		System.out.println(cadena2);
		System.out.println(cadena2.charAt(4));
		System.out.println(cadena2.length());
		System.out.println(cadena2.repeat(3));
		String[] lista = cadena2.split("l");
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		//Mismo resultado, dos formas diferentes
		char[] caracteres = cadena2.toCharArray();
		for (int i=0;i<caracteres.length;i++) {
			System.out.println(caracteres[i]);
		}
		for (int i=0;i<cadena2.length();i++) {
			System.out.println(cadena2.charAt(i));
		}
	}

}
