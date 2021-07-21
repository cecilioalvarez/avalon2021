package Estudio010_006_Herencia_Casting;

public class Deportista extends Persona {

	private String deporte;
	
	public Deportista(String nombre, String deporte) {
		super(nombre);
		this.deporte = deporte;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	// he sobreescribido el metodo de la clase persona por esta
	// este metodo se puede generar desde el asistente de Eclipse
	// click derecho>source>override/implement Method
	//este metodo debería existir en la clase persona, de lo contrario no compilaría

	@Override
	public void andar() {
		//el super. obliga al programa a priorozar por la clase Deportista
		//es un metodo de la clase superior y reutilizar el codigo que hemos construido en persona
		super.imprimeTextoAndar();
		System.out.println("10 k/h");
	}
	
	

}
