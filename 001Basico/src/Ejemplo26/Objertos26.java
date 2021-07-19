package Ejemplo26;

import java.util.HashMap;
import java.util.Map;

public class Objertos26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Persona> mapa= new HashMap<String,Persona>();
		mapa.put("pepe", new Persona("pepe","perez",25));
		mapa.put("ana", new Persona("ana","gomez",15));
		mapa.put("maria", new Persona("maria","blanca",45));
		mapa.put("gema", new Persona("gema","perez",25));
		
		System.out.println(mapa.get("ana").getApellidos());
		System.out.println(mapa.get("pepe").getEdad());
		
		for (Map.Entry<String,Persona> entrada: mapa.entrySet()) {
			Persona p = entrada.getValue();
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
			
		}
		double edadMax=-1;
		double sumaEdad=0;
		int contador=0;
		for (Map.Entry<String,Persona> m: mapa.entrySet()) {
			Persona p = m.getValue();
			sumaEdad=sumaEdad + p.getEdad();
			contador++;
			if (p.getEdad()>edadMax) {
				edadMax=p.getEdad();
				
			}
		}
		System.out.println("Edad maxima: "+ edadMax);
		// mapa.size() también vale.
		System.out.println("Edad media: "+ sumaEdad/contador);
	}


}
