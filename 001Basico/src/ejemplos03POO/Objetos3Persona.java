package ejemplos03POO;

public class Objetos3Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1= new Persona();
		p1.setNombre("Pedro");
		p1.setEdad(67);
		
		System.out.println(p1.jubilado());
		System.out.println(p1.esMayordeEdad());
		System.out.println(p1.getNombre()+" "+p1.getEdad());
		
		Persona p2= new Persona();
		p2.setNombre("Pepe");
		p2.setEdad(17);
		
		System.out.println(p2.jubilado());
		System.out.println(p2.esMayordeEdad());
		System.out.println(p2.getNombre()+" "+p2.getEdad());
		
		
		
	}

}
