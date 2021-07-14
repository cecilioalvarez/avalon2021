package ejercicio14;

public class Main {
	public static void main(String[] args) {
		Persona p = new Persona(1, "Ale");
		p.addNota(new Nota("Lengua", 8));
		p.addNota(new Nota("Ingles", 10));
		p.addNota(new Nota("Lengua", 9));
		p.addNota(new Nota("Bio", 10));
		
		for (Nota elto : p.getNotas()) {
			//System.out.println(elto);
		}

		
		//System.out.println("La mejor nota es" + p.getMejorNota());
		//System.out.println("La mejor nota es" + p.getMejoresNotas());
		System.out.println("La mejor nota mas alta en "  + p.getNotaMejor("Lengua").getAsignatura() + " es " +  p.getNotaMejor("Lengua").getValor() );

	}

}
