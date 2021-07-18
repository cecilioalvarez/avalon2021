package Ejercicio_bombilla;

import java.util.ArrayList;

public class ejecutableBombillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombilla b1= new Bombilla(245356,100,true);
		Bombilla b2= new Bombilla(24,50,false);
		Bombilla b3= new Bombilla(6,10,false);
		Bombilla b4= new Bombilla(5356,200,true);
		ArrayList<Bombilla> bombillas=new ArrayList<Bombilla>();
		bombillas.add(b1);
		bombillas.add(b2);
		bombillas.add(b3);
		bombillas.add(b4);
		Habitacion h = new Habitacion(bombillas);
		System.out.println(h.sumaPotencia());
		System.out.println("id de la bombilla que mas gasta " +h.masGasta().getId());
		System.out.println("**************");
		h.encenderTodas();
		
	}

}
