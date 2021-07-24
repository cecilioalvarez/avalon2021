package Persona;

public class Objeto {

	public static void main(String[] args) {
		
		Persona p= new Persona();
		p.setNombre("pedro");
		p.setEdad(70);
		
		System.out.println(p.estaJubilado());
		System.out.println(p.esMayordeEdad());
		
		Persona p1= new Persona();
		p1.setNombre("ana");
		p1.setEdad(10);
		
		System.out.println(p1.estaJubilado());
		System.out.println(p1.esMayordeEdad());
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
		Persona p2 =new Persona();
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		
	}

}
