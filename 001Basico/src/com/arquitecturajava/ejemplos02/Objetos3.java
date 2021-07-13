package com.arquitecturajava.ejemplos02;

public class Objetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		p.nombre="Pedro";
		p.edad=68;
		if(p.estaJubilado()) {
			System.out.println("Está jubilado");
		}else {
			System.out.println("No está jubilado");
		}
	}

}
