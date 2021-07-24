package Estudio010_003_Herencia_Super_and_SuperVisibilidad.main;

import Estudio010_003_Herencia_Super_and_SuperVisibilidad.Deportista;
import Estudio010_003_Herencia_Super_and_SuperVisibilidad.Persona;

public class Principal {

	public static void main(String[] args) {

//como vimos en el ejemplo anterior , tuvimos que inicializar el deportista con el metodo set
		//para no hacerlo asi, podemos utilizar los constructores
		Deportista d1 = new Deportista();
		d1.setNombre("pedro");
		d1.setDeporte("tenni");
		d1.andar();

		Persona p1=new Persona();
		p1.setNombre("juaco");
		p1.andar();

	}

}
