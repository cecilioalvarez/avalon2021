package ejercicio15;

public class Principal {
	public static void main(String[] args) {
		Libro l = new Libro("java", "pedro", 200);
		Libro l1 = new Libro("java1", "pedro1", 400);
		Libro l2 = new Libro("java2", "pedro2", 300);
		
		System.out.println(l.getTitulo());
		System.out.println(l1.getTitulo());
		System.out.println(l2.getTitulo());
		System.out.println(Libro.getContador());
		
		Calculadora c = new Calculadora();
		System.out.println(c.suma(2, 2));
		System.out.println(c.resta(2, 2));


	}

}
