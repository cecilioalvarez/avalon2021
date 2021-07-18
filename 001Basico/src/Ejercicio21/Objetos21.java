package Ejercicio21;

public class Objetos21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitacion h =new Habitacion();
		h.addBombilla(new Bombilla(11,200,true));
		h.addBombilla(new Bombilla(101,300,false));
		h.addBombilla(new Bombilla(11,100,true));
		System.out.println(h.getPotenciaTotal());
		
		h.apagar();
	}

}
