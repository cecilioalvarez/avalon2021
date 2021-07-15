package ejemplo14;

public class Objeto14_Libro {

	public static void main(String[] args) {
		
		Libro l= new Libro ("java","pedro",200);
		Libro l2= new Libro ("web","antonio",500);
		Libro l3= new Libro ("javascript","ana",100);
		Libro l4= new Libro ("python","juan",300);
		Libro l5= new Libro ("scala","pablo",300);
		System.out.println(l.getTitulo());
		System.out.println(l2.getTitulo());
		System.out.println(l3.getTitulo());
		System.out.println(Libro.getContador());
	}

}
