package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Objeto30 {
	public static void main(String[] args) {

		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		String cadenaFecha = "2021-08-40";
		try {
			Date fecha = formateador.parse(cadenaFecha);
			Calendar calendario = new GregorianCalendar();
			
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
