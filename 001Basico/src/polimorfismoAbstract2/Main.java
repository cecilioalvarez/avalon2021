package polimorfismoAbstract2;

public class Main {
	public static void main(String[] args) {
		Pared p = new Pared();
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		
		System.out.println("Area " +  p.getArea());
		System.out.println("Superficie " + p.getSuperficie());
	}

}
