package ejemplos40_Java8_Intro;

import java.util.Comparator;

public class PersonaNombreApellidosComparator implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		if(o1.getNombre().compareTo(o2.getNombre()) == 1) {
			System.out.println(1);
			return 1;
		}else if (o1.getNombre().compareTo(o2.getNombre()) == -1){
			System.out.println(-1);
			return -1;
		}else{
			if(o1.getApellidos().compareTo(o2.getApellidos()) == 1) {
				System.out.println("Apellidos 1");
				return 1;
			}else if (o1.getApellidos().compareTo(o2.getApellidos()) == -1){
				System.out.println("Apellidos -1");
				return -1;
			}else {
				System.out.println("else 0");
				return 0;
			}
		}
	}

}
