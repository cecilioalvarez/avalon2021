package _014_POO_SobrecargaConstructores;

public class ObjetoCoche {

	public static void main(String[] args) {
		
		Coche c1=new Coche ("toyota","corolla");
		
		//utilizamos una sobrecarga de constructor
		//son muy habituales y practicas en el dia dia
		Coche c2=new Coche ("yaris");
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c2.getMarca());
		System.out.println(c2.getModelo());

	}

}
