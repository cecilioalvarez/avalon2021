package Estudio010_004_Herencia_Super_and_Super;

public class Persona {
	
	private String nombre;
	//el super hace referencia al constructor de la clase padre
	//en este caso la clase padre es la clase object
	//el constructor nos ayuda a no tener que llamar el metodo set en el programa principal
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
