package ejemplos15Herencia;

public class Objetos15 {

	public static void main(String[] args) {
		
		Portatil p = new Portatil("Dell", 700, 100);
		
		System.out.println(p.getMarca());
		System.out.println(p.getPrecio());
		System.out.println(p.getBateria());
		p.encender();
		
		Ordenador o= new Ordenador("Mac", 2000);
		o.encender();

	}

}
