package com.arquitecturajava.ejemplos19;

public class Objetos19 {

	public static void main(String[] args) {
		Habitacion h = new Habitacion();
		h.addBombilla(new Bombilla(1,60,true),new Bombilla(4,80,true));
		h.addBombilla(new Bombilla(2,40,true));
		h.addBombilla(new Bombilla(3,30,false));
		
		System.out.println(h.getPotenciaTotal());
		h.getBombillaMaxConsumo();
		System.out.println(h.getBombillaGastoMaximo());
		h.apagarBombillas();
		h.encenderBombillas();
	}
}
