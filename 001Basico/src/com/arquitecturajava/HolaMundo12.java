package com.arquitecturajava;

import java.util.Iterator;

public class HolaMundo12 {
	public static void main(String[] args) {
		
		int [] lista= new int[5];
		lista[0] =4;
		lista[1] =5;
		lista[2] =7;
		lista[3] =8;
		lista[4] =9;
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]+1);
		}
		
		for (int i=lista.length-1;i>0;i--) {
			System.out.println(lista[i]);
		}
		
	}
}
