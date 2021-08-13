package _018_Herencia;

public class Deportista extends Persona {

	//en este concepto de herencia el hijo, que en este caso es deportista
	//hereda todas las propiedades y metodos del padre, en este caso la clase persona
	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	

}
