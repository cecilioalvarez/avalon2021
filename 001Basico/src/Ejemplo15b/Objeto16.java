package Ejemplo15b;

public class Objeto16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro l= new Libro("java","juan",200,1,"oreilly");
		Documento d= new Documento("doc1","juan",20);
		Comic c= new Comic("spiderman","pepito",80,1,"marvel");

		System.out.println(l.getTitulo());
		System.out.println(l.getAutor());
		System.out.println(l.getPeso());		
		System.out.println(d.getTitulo());
		System.out.println(d.getAutor());

	}

}
