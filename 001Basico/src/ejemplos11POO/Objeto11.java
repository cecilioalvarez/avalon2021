package ejemplos11POO;

public class Objeto11 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Pedro", 23, new Mascota("Kira"));
		
		System.out.println(p1.getMascota().getNombre());

	}

}
