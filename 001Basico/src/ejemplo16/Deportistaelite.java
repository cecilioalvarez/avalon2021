package ejemplo16;

public class Deportistaelite extends Deportista {
	
	private String federacion;

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

	public Deportistaelite(String nombre, int edad, String deporte,String federacion) {
		super(nombre, edad, deporte);
		// TODO Auto-generated constructor stub
	}
	
	
}
