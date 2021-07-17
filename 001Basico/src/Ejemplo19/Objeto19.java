package Ejemplo19;

import java.util.ArrayList;

public class Objeto19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h= new Habitacion();
		ArrayList<Bombilla> lista= new ArrayList<Bombilla>();
		
		
		h.addBombilla(new Bombilla(1,60,true),new Bombilla(2,70,true));
		h.addBombilla(new Bombilla(2,40,true));
		h.addBombilla(new Bombilla(3,30,false));
		
		System.out.println(h.getPotenciaTotal());

		h.encender();
		h.apagar();
		System.out.println(h.getBombillaGastoMaximo());
	}

}
