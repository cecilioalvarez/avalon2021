package Ejemplos15;

public class Objetos15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portatil p = new Portatil("Dell",800,100);
		System.out.println(p.getMarca());
		System.out.println(p.getPrecio());
		System.out.println(p.getBateria());
		Ordenador o1 = new Ordenador("Asus",600);
		p.encender();
		o1.encender();
	}

}
