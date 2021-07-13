package com.arquitecturajava.ejemplos4;

public class Objetos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		p.setNombre("Pedro");
		p.setEdad(17);
		
		if(p.mayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
			
		}
	}

}
