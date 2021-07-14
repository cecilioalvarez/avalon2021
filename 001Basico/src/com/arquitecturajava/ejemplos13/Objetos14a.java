package com.arquitecturajava.ejemplos13;

public class Objetos14a {

	public static void main(String[] args) {
		//Calculadora c=new Calculadora();  No es necesaria esta clase ya que son metodos estaticos
		//Al ser metodos estaticos debemos llamar al nombre de la clase y no al nombre del objeto.
		System.out.println(Calculadora.suma(2, 2));
		System.out.println(Calculadora.resta(2, 2));
	}

}
