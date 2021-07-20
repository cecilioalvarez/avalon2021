package ejemplos29_Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Objetos29B {

	public static void main(String[] args) {

		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		String cadenaFecha = "2021-08-20";
		String cadenaFecha2 = "2021-08-22";
		
		try {
			Date fecha = formateador.parse(cadenaFecha);
			Date fecha2 = formateador.parse(cadenaFecha2);
			
			GregorianCalendar calendario = new GregorianCalendar();
			//Establece si es permisivo o no, hace calculos para cuadrar la fecha
			calendario.setLenient(false);
			//calendario.set(Calendar.DATE, 40);
			//calendario.set(Calendar.MONTH, 13);
			//calendario.set(Calendar.YEAR, 2020);
			
			calendario.setTime(fecha);
			System.out.println(calendario.get(Calendar.DATE));
			System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
			System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
			System.out.println(calendario.get(Calendar.MONTH));
			
			System.out.println("------------------");
			//Booleano que devuelve true si la fecha del calendario 
			//es posterior a la fecha pasada como parametro en metodo after
			//fecha no es posterior a fecha2 y devuelve false
			System.out.println(calendario.after(fecha2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
