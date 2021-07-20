package Ejemplos29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Objetos31 {

	public static void main(String[] args) {
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		String cadenaFecha="2021-08-20";
		String cadenaFecha2="2021-08-22";
		try {
			// La clase date acumula incongruencias
			Date fecha= formateador.parse(cadenaFecha);
			Date fecha2= formateador.parse(cadenaFecha2);
			GregorianCalendar calendario = new GregorianCalendar();
			calendario.setLenient(false);
			
			calendario.set(Calendar.DATE, 40);
			calendario.set(Calendar.MONTH, 20);
			calendario.set(Calendar.YEAR, 2020);
			
			System.out.println(calendario.get(Calendar.DATE));
			System.out.println(calendario.get(Calendar.MONTH));
			System.out.println(calendario.get(Calendar.YEAR));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
