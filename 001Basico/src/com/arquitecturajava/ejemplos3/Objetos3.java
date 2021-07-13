package com.arquitecturajava.ejemplos3;

public class Objetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		p.setNombre("Pedro");
		p.setEdad(17);
		if(p.estaJubilado()) {
			System.out.println("Está jubilado");
		}else {
			System.out.println("No está jubilado");
		}
		if(p.mayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
			
		}
	}

}
