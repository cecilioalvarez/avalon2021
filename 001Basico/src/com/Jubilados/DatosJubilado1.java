package Jubilados;

public class DatosJubilado1 {

	public static void main(String[] args) {
		
		Jubilados person=new Jubilados();
		person.nombre="marcelo";
		person.edad=18;
		System.out.println(person.nombre);
		System.out.println(person.edad);
		System.out.println("¿está pensionado? " + person.estaJubilado());
		System.out.println("¿mayoria de edad? " + person.mayoriaedad());
	}

}
