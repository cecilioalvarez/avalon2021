package ejercicio40;

import java.util.Comparator;

public class PersonaApellidoComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getApellidos().compareTo(o2.getApellidos());
	}

}
