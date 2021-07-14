package ejercicio09;

public class Main {
	public static void main(String[] args) {
		Telefono tl = new Telefono(25, "xiami");
		Persona p1 = new Persona("ale", 29, tl);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getMitel().getNumero());
	}

}
