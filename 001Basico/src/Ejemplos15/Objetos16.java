package Ejemplos15;

public class Objetos16 {

	public static void main(String[] args) {
		// Documentos, libro, libro digital, comic
		/*Libro l = new Libro("java","juan",200,1,"oreilly");
		Documento d = new Documento("doc1","juan",20);
		Comic c = new Comic("Spiderman","Pepito",80,1,"marvel","fulanito");
		
		System.out.println(l.getTitulo());
		System.out.println(l.getAutor());
		System.out.println(l.getPeso());
		System.out.println(d.getTitulo());
		System.out.println(d.getAutor()); */
		CompraStandard cs= new CompraStandard("Pepe","Ordenador",100);
		
		System.out.println(cs.getImporteTotal());
			
	}

}
