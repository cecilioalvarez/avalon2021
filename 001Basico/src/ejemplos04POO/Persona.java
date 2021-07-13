package ejemplos04POO;

public class Persona {
	//private es operador de ambito, define ámbito para la variable
	private String nombre;
	private int edad;
	
	//Contructor
	public Persona() {
		this.setNombre("Maria");
		this.setEdad(20);
	}
	
	//Getters y Setters
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

	//Funciones
	public boolean jubilado() {
		if (edad>65) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean esMayordeEdad() {
		if (edad<18) {
			return false;
		}else {
			return true;
		}
		
	}
}
