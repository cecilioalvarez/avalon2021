package _008_Metodo_Estatico;

public class ObjetoPersona {
	// este metodo es estatico por que no hay que crear nada en otra clase para ejecutarlo
	//es publico para que se pueda acceder desde cualquier sitio
	public static void main(String[] args) {
		
//		MoldePersona02 persona1=new MoldePersona02();
//		persona1.setNombre("carlitos");
//		persona1.setEdad(38);
//		
//		System.out.println(persona1.getNombre());
//		System.out.println(persona1.getEdad());
//		System.out.println(persona1.tiempoJubilacion());
		
		System.out.println(MoldePersona02.tiempoJubilacionTotal(30));

	}

}
