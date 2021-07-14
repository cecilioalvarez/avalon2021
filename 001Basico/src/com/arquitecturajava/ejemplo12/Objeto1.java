package com.arquitecturajava.ejemplo12;

import java.util.ArrayList;

public class Objeto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		lista.remove(0);
		lista.remove("estas");
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		
	}

}
