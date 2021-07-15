package Ejemplo15;

public class Objeto15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Portatil p= new Portatil ("dell", 700,100);
		
		System.out.println(p.getMarca());
		System.out.println(p.getPrecio());
		System.out.println(p.getBateria());
		p.encender();
		Ordenador o= new Ordenador("mac",2000);
		o.encender();

	}

}
