package Estudio011_001_Composicion_Igualdad;

public class Persona {
	
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void andar () {
		System.out.println(getNombre() +"camina a 5 Km/h");
	}

}
