package herencia;

public class Main {
	public static void main(String[] args) {
		Portatil p = new Portatil("dell", 254, 100);
		System.out.println(p.getBateria());
		System.out.println(p.getMarca());
		System.out.println(p.getPrecio());
		p.encender();
		
		Ordenador pc = new Ordenador("hp", 400);
		pc.encender();
		
	}

}
