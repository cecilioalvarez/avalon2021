package ejemplos15Herencia;

public class Objetos15B_Documento {

	public static void main(String[] args) {

		Libro l = new Libro("java", 200, "Juan", "oreilly", 1);
		Documento d = new Documento("doc1",20, "Juan");
		Comic c = new Comic("Spiderman", 80, "Stan Lee", "Marvel", 1, "Stan Less");
		
		System.out.println(l.getTitulo());
		System.out.println(l.getAutor());
		System.out.println(l.getPeso());
		System.out.println(d.getTitulo());
		
		l.imprimir();
		c.imprimir();
		d.imprimir();
		

	}

}
