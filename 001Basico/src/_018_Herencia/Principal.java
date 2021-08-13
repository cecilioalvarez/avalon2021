package _018_Herencia;

public class Principal {

	public static void main(String[] args) {


		Deportista d1 = new Deportista();
		d1.setNombre("pedro");
		d1.setDeporte("tenni");
		
		System.out.println(d1.getNombre());
		System.out.println(d1.getDeporte());

	}

}
