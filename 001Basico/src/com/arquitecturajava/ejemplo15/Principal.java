package com.arquitecturajava.ejemplo15;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l=new Libro("java","pedro",200);
		Libro l2=new Libro("web","antonio",500);
		Libro l3=new Libro("javascript","ana",100);
		System.out.println(l.getTitulo());
		System.out.println(l2.getTitulo());
		System.out.println(l3.getTitulo());
		System.out.println(Libro.getContador());
		
		
		

	}

}
