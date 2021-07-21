package Estudio010_002_Herencia_Super_and_Super;

public class Principal {

	public static void main(String[] args) {


		Deportista d1 = new Deportista();
		d1.setNombre("pedro");
		d1.setDeporte("tenni");
		d1.andar();
		
		Persona p1=new Persona();
		p1.setNombre("juaco");
		p1.andar();

	}

}
