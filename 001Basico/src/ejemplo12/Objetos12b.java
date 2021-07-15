package ejemplo12;

import java.util.ArrayList;

public static void main(String[] args) {

	ArrayList<Persona> lista = new ArrayList<Persona>();

	lista.add(new Persona("fran",50));
	lista.add(new Persona("david", 50));
	lista.add(new Persona("ana", 20));

	
	for (Persona p : lista) {

		System.out.println(p.getNombre());
	}

	for (int i = 0; i < lista.size(); i++) {
		
		System.out.println(lista.get(i).getNombre());
	}
	
	Iterator<Persona> it= lista.iterator();
	while(it.hasNext()) {
		
		Persona p= it.next();
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
	}
	
	lista.forEach((p)->System.out.println(p.getNombre()+","+p.getEdad()));

}
}