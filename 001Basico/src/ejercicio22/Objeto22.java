package ejercicio22;

public class Objeto22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h=new Habitacion();
		
		h.addBombilla(new Bombilla(1,12,true));
		h.addBombilla(new Bombilla(2,12,true));
		h.addBombilla(new Bombilla(3,12,true));
		h.addBombilla(new Bombilla(4,12,true));
		h.addBombilla(new Bombilla(5,14,true));
		
		System.out.println(h.getPotenciaTotal());
		
		System.out.println("Bombilla con mas potencia :"+ h.getBombillaMayorPotencia());
		
		h.apagarHabitacion();
		h.encenderHabitacion();
	}

}
