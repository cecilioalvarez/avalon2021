package ejemplo9;

public class Objetos9 {
	public static void main(String[] args) {
		Telefono t1=new Telefono(111222333,"samsung");
		Persona p1=new Persona ("pepe",20,t1);
		System.out.println(p1.getNombre());
		System.out.println(p1.getTelefono().getNumero);
	}
}
