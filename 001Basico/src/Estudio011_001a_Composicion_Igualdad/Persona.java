package Estudio011_001a_Composicion_Igualdad;

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


	//el metodo hashCode devuelve un numero entero
	//si dos objetos son iguales deben devolver el msimo numero
	
	@Override
	public int hashCode() {
		//si dos personas tienen el msimo nombre va a devolver el mismo numero o hashCode
		return nombre.hashCode();
	}

	//vamos a sobreescribir el metodo equals
	//en este hay que tener mucho cuidado por que esta es la regla de negocio que se encarga de comprar una regla de igualdad a mayor detalle
	// aca lo que estamos es comparando la persona que entra con el nombre de la persona que tengo
	@Override
	public boolean equals(Object persona) {
		Persona nueva = (Persona) persona;
		return nueva.getNombre().equals(this.getNombre());
	}
	
	
}
