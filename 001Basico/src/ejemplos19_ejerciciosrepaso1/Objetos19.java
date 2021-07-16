package ejemplos19_ejerciciosrepaso1;

public class Objetos19 {

	public static void main(String[] args) {

		Habitacion h = new Habitacion("Salon");
		
		h.addBombillas(new Bombilla(0, 15, false)
				,new Bombilla(1, 10, true)
				,new Bombilla(2, 16, false));
		h.addBombillas(new Bombilla(3, 10, false));
		
		System.out.println(h.getPotenciaHabitacion());
		System.out.println("-------------");
		for (Bombilla bom : h.getListadoBombillas()) {
			System.out.println(bom.getId()+"-"+bom.isOn());
		}
		System.out.println("-------------");
		h.encenderBombillas();
		for (Bombilla bom : h.getListadoBombillas()) {
			System.out.println(bom.getId()+"-"+bom.isOn());
		}
		System.out.println("-------------");
		Bombilla b =h.getBombillaMasPotencia();
		System.out.println(b.getId()+"-"+b.getPotencia());
		h.apagarBombillas();
		h.encenderBombillas();
	}

}
