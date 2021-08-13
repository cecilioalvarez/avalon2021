package _016_POO_UtilizandoThis_DelegacionConstructores;

public class ObjetoCoche {

	public static void main(String[] args) {
		//constructor por defecto
		Coche c1=new Coche ();
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		
		Coche c2=new Coche ("renault","clio");
		
		System.out.println(c2.getMarca());
		System.out.println(c2.getModelo());

	}

}
