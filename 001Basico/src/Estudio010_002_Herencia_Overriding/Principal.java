package Estudio010_002_Herencia_Overriding;

public class Principal {

	public static void main(String[] args) {


		Deportista d1 = new Deportista();
		d1.setNombre("pedro");
		d1.setDeporte("tenni");
		
		System.out.println(d1.getNombre());
		System.out.println(d1.getDeporte());
		d1.andar();
		
		Persona p1=new Persona();
		p1.setNombre("juaco");
		p1.andar();

		System.out.println("_______________________");
		Persona p4=new Persona();
		p4.setNombre("pedorinads");
		p4.andar();
		
	}

}
