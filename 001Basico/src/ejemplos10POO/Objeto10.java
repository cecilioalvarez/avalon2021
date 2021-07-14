package ejemplos10POO;

public class Objeto10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t1 = new Telefono("Samsung",11223322);
		
		Persona p1 = new Persona("Pepe", 20, t1);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getTelefono().getNumero());
	}

}
