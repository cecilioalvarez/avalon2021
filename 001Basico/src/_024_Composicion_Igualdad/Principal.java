package _024_Composicion_Igualdad;

public class Principal {

	public static void main(String[] args) {

		Persona p1 = new Persona("juan");
		//la variable p2 apunta a la variable p1 por eso son iguales,
		//los dos apuntan al msimo objeto
		Persona p2 = p1;

		System.out.println(p1.getNombre());
		System.out.println(p2.getNombre());
		
		//el concepto de igualdad entre objetos en java no se trabajan con el operador de igualdad
		//funciona solo para tipos basicos 2==2 por ejemplo, ya que son uno de los 8 tipos basicos del lenguaje
		System.out.println(p1==p2);
		System.out.println(p1);
		System.out.println(p2);
		
		
		//aca sale falso, es por que tenemso dos objetos diferentes
		//con dos espacios diferentes en memoria
		Persona p3 = new Persona("carlos");
		Persona p4 = new Persona("carlos");

		System.out.println(p3.getNombre());
		System.out.println(p4.getNombre());
		
		System.out.println(p3==p4);
		System.out.println(p3);
		System.out.println(p4);
	}

}
