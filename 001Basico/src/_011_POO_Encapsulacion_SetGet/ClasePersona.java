package _011_POO_Encapsulacion_SetGet;

public class ClasePersona {
	
	//cuando yo le asigno private a cada propiedad de la clase Persona
	//solo podemos acceder a ellas desde la propia clase.
	//para poder acceder a ellas desde la clase main y limitar los valores de estas utilizamos el metodo set y get
	
	private String nombre;
	private int edad;
	
	// este metodo es el de asignacion 
	void setEdad(int edad) {
		//limitamos la asignacion a 120 años de edad
		//operador de ambito this nos sirve para que no tengamos que utilizar varios nombres para la asignacion de variables
		//asigna la edad de este objeto al valor que pasamos con edad
		if (edad > 120) {
			this.edad = 120;
		}else {
			
			this.edad = edad;
		}
	}

	//ahora hacemos el metodo de lectura
	int getEdad () {
		return edad;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	String getNombre() {
		return nombre;
	}
	
}
