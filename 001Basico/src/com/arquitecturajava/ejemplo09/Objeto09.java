package com.arquitecturajava.ejemplo09;

public class Objeto09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena=new String("hola");
		System.out.println(cadena);
		String cadena2="hola2";
		System.out.println(cadena2);
		System.out.println(cadena2.charAt(4));
		System.out.println(cadena2.length());
		System.out.println(cadena2.repeat(3));
		String[] lista=cadena2.split("l");
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		
	}

}
