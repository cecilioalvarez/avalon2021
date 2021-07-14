package ejemplos14POOStatic;

public class Objetos14 {

	public static void main(String[] args) {

		Libro l = new Libro("java", "Pedro", 200);
		Libro l2 = new Libro("web", "Antonio", 500);
		Libro l3 = new Libro("javascript", "Ana", 100);
		
		System.out.println(l.getTitulo());
		System.out.println(l2.getTitulo());
		System.out.println(l3.getTitulo());
		//Contador es de la clase Libro 
		//pero no de cada objeto creado por ser static
		System.out.println(Libro.getContador());

	}

}
