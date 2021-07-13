package ejemplos02;

public class Objetos3Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1= new Persona();
		p1.nombre="Pedro";
		p1.edad = 67;
		
		System.out.println(p1.jubilado());
		
		Persona p2= new Persona();
		p2.nombre="Pepe";
		p2.edad = 27;
		
		System.out.println(p2.jubilado());
		
	}

}
