package com.arquitecturajava.ejemplos29;

import java.util.Calendar;
import java.util.Date;

public class Objeto29 {

	public static void main(String[] args) {
		
		//La clase Date aunque funcione esta deprecada
		/*Date fecha = new Date();
		System.out.println(fecha.getDay());
		System.out.println(fecha.getHours());
		System.out.println(fecha.getSeconds());*/
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.YEAR, 2021);
		calendario.set(Calendar.MONTH, 6);
		calendario.set(Calendar.DATE, 20);

		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.DATE));
		//Añado dos meses
		calendario.add(Calendar.MONTH, 2);
		//Añado 5 dias
		calendario.add(Calendar.DATE, 5);
		
		Date fecha = calendario.getTime();
		System.out.println(fecha);
		
	}

}
