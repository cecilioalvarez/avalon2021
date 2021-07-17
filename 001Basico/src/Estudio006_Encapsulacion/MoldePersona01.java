package Estudio006_Encapsulacion;

public class MoldePersona01 {

	// cuando queremos limitar los valores de una propiedad, por ejemplo la edad
	// que no queremos que se pueda colocar edades por encima de 130 años por
	// ejemplo
	// utilizamos unos metodos o funciones que java nos provee como son el :
	// set y get, lo que hace es limitar los atributos de la propiedad
	// normalmente todas las propiedades en Java se ancapsulan a traves de variables
	// privadas y
	// una pareja de metodos set y get que limitan el acceso
	// cuando declaramos dos variables como private ya no se pueden asignar en
	// ningun programa,
	// para solventar esto se utiliza el metodo set y get
	// solo se puede acceder a una variable privada desde la clase

	private String nombre;

	// para generar el metodo set y get solo debemos hacer
	// dobleclick>source>generate setters and getters
	// el Metodo Get o funcion: que nos devuelve el valor de la propiedad
	// el Metodo Set o funcion: nos asigna el valor de la propeidad

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 100) {
			this.edad = edad;
		} else {
			this.edad=100;
		}
	}

	// cuando vamos a utilizar esta propiedad en un objeto, debemos ponerla publica
	public int tiempoJubilacion() {
		return 70 - edad;
	}
}
