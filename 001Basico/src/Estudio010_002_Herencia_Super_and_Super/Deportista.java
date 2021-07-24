package Estudio010_002_Herencia_Super_and_Super;

public class Deportista extends Persona {

	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	// he sobreescribido el metodo de la clase persona por esta
	// este metodo se puede generar desde el asistente de Eclipse
	// click derecho>source>override/implement Method
	//este metodo deber�a existir en la clase persona, de lo contrario no compilar�a

	@Override
	public void andar() {
		//el super. obliga al programa a priorozar por la clase Deportista
		//es un metodo de la clase superior y reutilizar el codigo que hemos construido en persona
		super.imprimeTextoAndar();
		System.out.println("10 k/h");
	}
	
	

}
