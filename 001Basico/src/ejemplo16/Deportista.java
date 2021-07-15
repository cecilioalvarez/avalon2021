package ejemplo16;

public class Deportista extends Persona {
	
	private String deporte;

	public Deportista(String nombre, int edad,String deporte) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	
	 
	
}
