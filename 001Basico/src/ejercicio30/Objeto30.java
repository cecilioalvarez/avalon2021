package ejercicio30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Objeto30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date fecha=new Date();
//		System.out.println(fecha.getDay());
//		System.out.println(fecha.getHours());
//		System.out.println(fecha.getSeconds());
		
//		Calendar calendario =Calendar.getInstance();
//		calendario.set(Calendar.YEAR,2021);
//		calendario.set(Calendar.MONTH,6);
//		calendario.set(Calendar.DATE,20);
//		
//		System.out.println(calendario.get(Calendar.YEAR));
//		System.out.println(calendario.get(Calendar.MONTH));
//		System.out.println(calendario.get(Calendar.DATE));
//		
//		calendario.add(Calendar.MONTH, 2);
//		calendario.add(Calendar.DATE, 5);
//		
//		Date fecha=calendario.getTime();
//		
//		System.out.println(fecha);
		
		SimpleDateFormat formateador= new SimpleDateFormat("yyyy-MM-dd");
		String cadenaFecha="2021-08-20";
		
		try {
			Date fecha=formateador.parse(cadenaFecha);
			GregorianCalendar calendario=new GregorianCalendar();
			calendario.setTime(fecha);
			System.out.println(calendario.get(Calendar.DATE));
			System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
			System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
			System.out.println(calendario.get(Calendar.MONTH));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
