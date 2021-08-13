package _007_Encapsulacion;

import _006_IntroduccionPOO.MoldePersona;

public class ObjetoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoldePersona01 persona1=new MoldePersona01();
		persona1.setNombre("carlos");
		persona1.setEdad(12);
		
		MoldePersona01 persona2=new MoldePersona01();
		persona2.setNombre("pedro");
		persona2.setEdad(238);
		
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		System.out.println(persona1.tiempoJubilacion());
		
		System.out.println("____________________________");
		
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());
		System.out.println(persona2.tiempoJubilacion());
		
	}

}
