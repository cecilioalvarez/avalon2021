package Estudio010_005_Herencia_Polimorfismo_Encapsulacion;

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
	// creo un nuevo metodo
	public void imprimeTextoAndar () {
		System.out.print(getNombre()+" anda a ");
	}
	
	public void andar() {
		imprimeTextoAndar();
		System.out.println("5 k/h");
	}
	
}
