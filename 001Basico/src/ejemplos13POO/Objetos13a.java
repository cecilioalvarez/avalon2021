package ejemplos13POO;

public class Objetos13a {
	public static void main(String[] args) {
		
		Persona p = new Persona("Gema",30);
		
		//p.getNotas().add(new Nota("lengua", 4));
		p.addNota((new Nota("lengua", 4)));
		p.addNota((new Nota("mates", 8)));
		p.addNota((new Nota("ingles", 4)));
		p.addNota((new Nota("fisica", 10)));
		p.addNota((new Nota("quimica", 10)));
		
		for (Nota n : p.getNotas()) {
			System.out.println(n);
		}
		
		for (Nota n : p.getMejoresNotas()) {
			System.out.println("Notas Máximas: "+n);
		}
		
	}
}
