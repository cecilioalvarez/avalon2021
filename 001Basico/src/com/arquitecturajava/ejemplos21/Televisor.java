package com.arquitecturajava.ejemplos21;

public class Televisor implements Conectable{

	@Override 
	public void encederBombilla() {
		System.out.println("el televisor se encience");
	}
	
	@Override 
	public void apagarBombilla() {
		System.out.println("el televisor se apaga");
	}
}
