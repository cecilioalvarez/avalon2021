package com.arquitecturajava.ejemplos02;

public class Objetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		p.nombre="Pedro";
		p.edad=17;
		if(p.estaJubilado()) {
			System.out.println("Est� jubilado");
		}else {
			System.out.println("No est� jubilado");
		}
		if(p.mayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
			
		}
	}

}
