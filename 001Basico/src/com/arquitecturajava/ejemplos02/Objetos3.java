package com.arquitecturajava.ejemplos02;

public class Objetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona juan=new Persona();
		juan.edad=68;
		if(juan.estaJubilado()) {
			System.out.println("Está jubilado");
		}else {
			System.out.println("No está jubilado");
		}
	}

}
