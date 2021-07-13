package com.arquitecturajava.ejemplos4;

public class Objeto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t= new Television("Samsung",1200,true);
		
		System.out.println(t.isEncendido());
		t.off();
		System.out.println(t.isEncendido());
	}

}
