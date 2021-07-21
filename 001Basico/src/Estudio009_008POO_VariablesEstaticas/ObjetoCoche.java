package Estudio009_008POO_VariablesEstaticas;

public class ObjetoCoche {

	public static void main(String[] args) {
		//constructor por defecto
		Coche c1=new Coche ();
		Coche c2=new Coche ();
		Coche c3=new Coche ();
		Coche c4=new Coche ();
		Coche c5=new Coche ();
		Coche c6=new Coche("bmw", "l3");
		//deberia arrojarnos un 5 cuando dejamos la variable contador asignada asi:private int contador;
		//el problema es que cada objeto tiene su propia variable contador,
		//por tal motivo cada objeto siempre nos dara en su variable contador un 1
		//para corregir esto utilizamos las variables estaticas
		// a las variables estaticas tambien se les denomina variables de clase
		System.out.println(c3.getContador());
		System.out.println(c1.getContador());
		System.out.println(c4.getContador());
		

	}

}
