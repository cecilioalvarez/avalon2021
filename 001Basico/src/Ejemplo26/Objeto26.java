package Ejemplo26;

import java.util.HashMap;
import java.util.Map;

public class Objeto26 {

	public static void main(String[] args) {

		Map<String, Persona> mapa = new HashMap<String, Persona>();

		mapa.put("pepe", new Persona("Pepe", "Perez", 25));
		mapa.put("ana", new Persona("Ana", "Gomez", 30));
		mapa.put("maria", new Persona("Maria", "Blanca", 50));
		mapa.put("gema", new Persona("Gema", "Perez", 30));

		System.out.println(mapa.get("pepe").getApellidos());
		System.out.println(mapa.get("pepe").getEdad());
		System.out.println("------------------------------");


		for(Map.Entry<String, Persona> mapElement: mapa.entrySet()) {
			System.out.println(mapElement.getValue().getNombre()+"-"+mapElement.getValue().getApellidos());
			System.out.println(mapElement.getValue().getEdad());
		}
		System.out.println("------------------------------");
		Map.Entry<String, Persona> elementMaxEdad = getMaxEdad(mapa);
		System.out.println(elementMaxEdad.getValue().getNombre()+"-"+elementMaxEdad.getValue().getEdad());

		System.out.println("------------------------------");
		System.out.println("Edad media: "+getMediaEdad(mapa));
	}

	public static Map.Entry<String, Persona> getMaxEdad(Map<String, Persona> mapa){
		Map.Entry<String, Persona> elementMaxEdad = null;

		for(Map.Entry<String, Persona> mapElement: mapa.entrySet()) {
			if (elementMaxEdad == null || elementMaxEdad.getValue().getEdad()< mapElement.getValue().getEdad()) {
				elementMaxEdad=mapElement;
			}
		}

		return elementMaxEdad;

	}

	public static double getMediaEdad(Map<String, Persona> mapa){
		double sumaEdad = 0;

		for(Map.Entry<String, Persona> mapElement: mapa.entrySet()) {

			sumaEdad+=mapElement.getValue().getEdad();
		}

		return sumaEdad/mapa.size();

	}

}