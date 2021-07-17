package Estudio007_Metodo_Estatico;

public class MoldePersona02 {
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//con esta opcion necesitamos crear primero una persona en el objeto persona 
	// a esa persona asignarle un nombre una edad o las propiedades que se han definido 
	// y luego aho si podemos calcular los años de tiempo para la jubilacion 
	public int tiempoJubilacion() {
		return 70-edad;
	}
	// con el metodo public static podemos crear directamente el calculo del toepo de jubilacion 
	// sin tener que crear una persona en el objetoPersona
	public static int tiempoJubilacionTotal(int edad) {
		return 70-edad;
	}

}
