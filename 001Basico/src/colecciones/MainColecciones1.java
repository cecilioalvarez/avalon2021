package colecciones;

import java.util.HashMap;
import java.util.Map;

public class MainColecciones1 {
	public static void main(String[] args) {
		// clave/nombre
		HashMap<String, Persona> mapa = new HashMap<String, Persona>();
		mapa.put("pepe", new Persona("pepe", "perez", 25));
		mapa.put("ana", new Persona("ana", "gomez", 45));
		mapa.put("ale", new Persona("ale", "garcia", 35));
		mapa.put("dani", new Persona("dani", "perezosa", 5));
		System.out.print(mapa.get("pepe").getApellido());
		System.out.println(mapa.get("pepe").getEdad());

		int edades = 0;
		int mayor = 0;
		
		for (Map.Entry<String, Persona> entrada : mapa.entrySet()) {
			if (mayor < entrada.getValue().getEdad() ) 
				mayor =entrada.getValue().getEdad();
			
//			System.out.print(entrada.getValue().getNombre());
//			System.out.print(entrada.getValue().getApellido());
//			System.out.println(entrada.getValue().getEdad());
//			System.out.println("**********************");
			edades += entrada.getValue().getEdad();

		}
		System.out.println("La mayor edad es de " + mayor);
		System.out.println("La media de años es de " + edades/mapa.size());

	}

}
