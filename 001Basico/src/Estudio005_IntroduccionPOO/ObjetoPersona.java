package Estudio005_IntroduccionPOO;

public class ObjetoPersona {
	
	public static void main(String[] args) {
		//aca inicializo la persona 1 con las propiedades de la clase moldePersona
		MoldePersona persona1=new MoldePersona();
		persona1.nombre="carlos";
		persona1.edad=27;
		
		MoldePersona persona2=new MoldePersona();
		persona2.nombre="pedro";
		persona2.edad=58;
		
		
		//ahora podemos sacar los datos por pantalla
		
		System.out.println(persona1.nombre);
		System.out.println(persona1.edad);
		System.out.println(persona1.tiempoJubilacion());
		
		System.out.println("____________________________");
		
		System.out.println(persona2.nombre);
		System.out.println(persona2.edad);
		System.out.println(persona2.tiempoJubilacion());
	}

}
