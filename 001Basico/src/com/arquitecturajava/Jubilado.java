package com.arquitecturajava;

public class Jubilado {

	public static void main(String[] args) {
		
		ObjetosEjec r=new ObjetosEjec();
		r.edad=70;
		if (r.edad>=65) {
		System.out.println("Esta persona est� jubilada");
	}else {
		System.out.println("Esta persona no est� jubilada");
		
}
	}
}
