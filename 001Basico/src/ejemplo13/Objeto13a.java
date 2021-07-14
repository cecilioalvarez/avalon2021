package ejemplo13;

public class Objeto13a {

	public static void main(String[] args) {
		
		Persona p= new Persona("gema",30);
		p.getNotas().add(new Nota("lengua",4));
		
		for (Nota n: p.getNotas()) {
			System.out.println(n);
		}

	}

}
