package ejemplos41_Java8_Streams;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<String> mensajes = new ArrayList<String>();
		mensajes.add("Hola");
		mensajes.add("Adios");
		mensajes.add("que");
		mensajes.add("tal");
		
		for (String mensaje : mensajes) {
			System.out.println(mensaje);
		}
		System.out.println("------------------------");
		mensajes.stream().forEach((s)->System.out.println(s));

		System.out.println("------------------------");
		//map
		mensajes.stream()
		.map((s)->s.toUpperCase())
		.forEach((s)->System.out.println(s));
		
		System.out.println("------------------------");
		//filter y map
		mensajes.stream()
		.filter((s)->s.length()>4)
		.map((s)->s.toUpperCase())
		.forEach((s)->System.out.println(s));
		
		
		
	}

}
