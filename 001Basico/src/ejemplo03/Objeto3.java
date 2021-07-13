package ejemplo03;

public class Objeto3 {
	public static void main(String[] args) {
		Persona per = new Persona();
		Persona per2 = new Persona();

		per.setNombre("Carmen");
		per.setEdad(10);
		System.out.println(per.edad + " " + per.nombre);
		//per2.nombre = "Jaime";
		//per2.edad = 7;

	}

}
