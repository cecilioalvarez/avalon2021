package ejercicio28;

import java.util.HashMap;
import java.util.Map;

public class Objeto28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Persona> mapa = new HashMap<String, Persona>();
		mapa.put("pepe", new Persona("pepe", "perez", 20));
		mapa.put("ana", new Persona("ana", "garcia", 21));
		mapa.put("maria", new Persona("maria", "gonzalez", 25));
		mapa.put("raul", new Persona("raul", "gonzalez", 25));
		mapa.put("juan", new Persona("juan", "diaz", 35));
		mapa.put("alberto", new Persona("alberto", "velez", 25));

		Persona pmaximaedad = new Persona();
		for (Map.Entry<String, Persona> entrada : mapa.entrySet()) {

			Persona p = entrada.getValue();

			if (p.getEdad() > pmaximaedad.getEdad()) {
				pmaximaedad = p;

			}

		}
		System.out.println(
				"La persona mayor es " + pmaximaedad.getNombre() + " y tiene " + pmaximaedad.getEdad() + " años");

		double mediaedad = 0;

		for (Map.Entry<String, Persona> entrada : mapa.entrySet()) {

			Persona p = entrada.getValue();

			mediaedad += p.getEdad();

		}
		System.out.println("La edad media es : " + mediaedad / mapa.size());

	}

}
