package ejemplos18Herencia;

import java.util.ArrayList;

public class Objetos18Azulejo {

	public static void main(String[] args) {
		
		ArrayList<Azulejo> listaAz= new ArrayList<Azulejo>();
		listaAz.add(new Azulejo(2, 2, 10, "Marron"));
		listaAz.add(new Azulejo(3, 3, 20, "Marron"));
		listaAz.add(new Azulejo(2, 2, 10, "Marron"));
		listaAz.add(new Azulejo(4, 4, 40, "Marron"));
		
		Pared p = new Pared(listaAz);
		p.addAzulejos(new Azulejo(4, 4, 40, "Marron"),new Azulejo(2, 2, 10, "Marron"));
		
		System.out.println("Area:"+p.getAreaCubierta());
		System.out.println("Coste:"+p.getCoste());

	}

}
