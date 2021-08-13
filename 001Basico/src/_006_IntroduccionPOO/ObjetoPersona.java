package _006_IntroduccionPOO;

public class ObjetoPersona {
	
	public static void main(String[] args) {
		
		//aca inicializo la persona 1 con las propiedades de la clase moldePersona
		//para declarar la variable debo llamar primero a la clase MoldePersona
		MoldePersona persona1=new MoldePersona();
		persona1.nombre="carlos";
		persona1.edad=80;
		persona1.estatura=1.80;
		persona1.peso=70;
		persona1.raza="negro";
		
		
		//ahora podemos sacar los datos por pantalla
		
		System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		System.out.println(persona1.estatura);
		persona1.tiempoJubilacion();
		System.out.println(persona1.masCorporal());
	}

}
