package ejemplos18Herencia;

public class Objetos18B {

	public static void main(String[] args) {
		
		Azulejo a1= new Azulejo(2, 3, 10, "Verde");
		Azulejo a2= new Azulejo(2, 3, 10, "Verde");
		
		Pared p = new Pared();
		p.addAzulejo(a1);
		p.addAzulejo(a2);
		
		p.removeAzulejo(a1);
		
		//Override en clase Azulejo de equals y hashcode
		System.out.println(a1.equals(a2));

	}

}
