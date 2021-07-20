package com.arquitecturajava.ejemplos29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Objteo30 {

	public static void main(String[] args) {
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		String cadenaFecha = "2021-08-20";
		String cadenaFecha2 = "2021-08-22";
		try {
			//La clase date acumula incongruencias
			Date fecha = formateador.parse(cadenaFecha);
			Date fecha2 = formateador.parse(cadenaFecha2);
			GregorianCalendar calendario = new GregorianCalendar();
			//Con esta linea le decimos que si hay alguna fecha que no sea real, nos falle.
			calendario.setLenient(false);	
			calendario.setTime(fecha);
			
			System.out.println(calendario.after(fecha2));
			//calendario.set(Calendar.DATE,40);
			//calendario.set(Calendar.MONTH,20);
			//calendario.set(Calendar.YEAR,2020);
			
			System.out.println(calendario.get(Calendar.DATE));
			System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
			System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
			System.out.println(calendario.get(Calendar.MONTH));
		} catch (ParseException e){
			e.printStackTrace();
			
		}
	}

}
