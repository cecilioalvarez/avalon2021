package _006_IntroduccionPOO;

//una clase es un molde que tiene unas propiedades y unas funcionalidades
public class MoldePersona {

	// estas son propiedades de la clase
	String nombre;
	int edad;
	double estatura;
	double peso;
	String raza;

	// ahora vamos a construir metodos o funciones que acompañaran a nuestro objeto
	// cuando vamos a utilizar esta propiedad en un objeto debemos ponerla publica
	public void tiempoJubilacion() {
		if (edad >= 70) {
			System.out.println("usted ya debe estar jubilado");
		} else {
			System.out.println("el tiempo para su jubilacion es: " + (70 - edad));
		}
		
	}

	public double masCorporal() {
		return peso / Math.pow(estatura, 2);
	}

}
