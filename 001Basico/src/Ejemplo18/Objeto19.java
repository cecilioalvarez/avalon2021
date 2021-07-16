package Ejemplo18;

public class Objeto19 {

	public static void main(String[] args) {


		Pared p= new Pared();
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2));
		p.addAzulejo(new Azulejo(2, 2),new Azulejo(2,3));

		System.out.println(p.area());

	}

}
