package _020_Herencia_Super_and_Super;

public class Persona {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// creo un nuevo metodo
	public void imprimeTextoAndar () {
		System.out.print(getNombre()+" anda a ");
	}
	
	public void andar() {
		imprimeTextoAndar();
		System.out.println("5 k/h");
	}
	
}
