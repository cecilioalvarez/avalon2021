package Estudio005_IntroduccionPOO;


//una clase es un molde que tiene unas propiedades y unas funcionalidades
public class MoldePersona {
	
	//estas son propiedades de la clase
	String nombre;
	int edad;
	
	// cuando vamos a utilizar esta propiedad en un objeto, debemos ponerla publica
	public int tiempoJubilacion() {
		return 70-edad;
	}
	
	

}
