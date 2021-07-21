package Estudio010_003_Herencia_Super_and_SuperVisibilidad;

public class Persona {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// creo un nuevo metodo
	//para que el metodo imprimeTextoAndar no salga en las opciones del programa principal le quitamos el public
	//nos aparecerera una forma de tyriangulo que es denominada una visibilidad de paquete
	//para quitarlas definitivamente debemos organizar el codigo en paquetes 
	void imprimeTextoAndar () {
		System.out.print(getNombre()+" anda a ");
	}
	
	public void andar() {
		imprimeTextoAndar();
		System.out.println("5 k/h");
	}
	
}
