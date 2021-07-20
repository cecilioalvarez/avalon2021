package com.arquitecturajava.ejemplos29;

import java.util.Calendar;
import java.util.Date;

public class Objeto30 {
	public static void main(String[] args) {

		Calendar calendario= Calendar.getInstance();

		calendario.set(Calendar.YEAR,2021);
		calendario.set(Calendar.MONTH,6);
		calendario.set(Calendar.DATE,20);
		
		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.DATE));
		calendario.add(Calendar.MONTH, 2);
		calendario.add(Calendar.DATE, 5);
		
		
		Date fecha= calendario.getTime();
		
		System.out.println(fecha);
		
		
		
		
		
	}
}
