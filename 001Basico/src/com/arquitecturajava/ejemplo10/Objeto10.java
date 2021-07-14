package com.arquitecturajava.ejemplo10;

public class Objeto10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1=new Telefono(1111151,"samsung");
		Persona p1=new Persona("pepe",20,t1);
		System.out.println(p1.getNombre());
		System.out.println(p1.getTelefono().getNumero());

	}

}
