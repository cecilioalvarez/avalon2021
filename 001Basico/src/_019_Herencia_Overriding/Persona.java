package _019_Herencia_Overriding;

public class Persona {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void andar() {
		System.out.println(getNombre()+" anda a 5 k/h");
	}
	
}
