package ejemplos29_Date_Calendar;

import java.util.Calendar;
import java.util.Date;

public class Objetos29 {

	public static void main(String[] args) {

		/*Date fecha = new Date();
		
		//Metodos deprecados de clase Date
		fecha.getDay();
		fecha.getHours();
		fecha.getSeconds();*/
		
		Calendar calendario = Calendar.getInstance();
		
		//Meses van de 0-11
		calendario.set(Calendar.YEAR,2021);
		calendario.set(Calendar.MONTH,6);
		calendario.set(Calendar.DATE,20);
		
		System.out.println(calendario.get(Calendar.YEAR));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.DATE));
		
		//Con el método add se suman días meses o años al calendario
		//Suma 2 meses pasando de julio a septiembre
		calendario.add(Calendar.MONTH, 2);
		//Suma 5 días pasando del 20 al 25
		calendario.add(Calendar.DATE, 5);
		
		Date fecha = calendario.getTime();
		
		System.out.println(fecha);
	}

}
