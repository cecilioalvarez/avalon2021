package ejemplos14POOStatic;

public class Objetos14a_Calc {

	public static void main(String[] args) {

		//Esta clase no tiene atributos propios(No tiene estados)
		
		/*Calculadora c= new Calculadora();
		System.out.println(c.suma(2, 2));
		System.out.println(c.resta(2, 2));*/
		
		//Se pueden hacer métodos estáticos para invocarlos 
		//directamente de la Clase, sin crear instancias
		System.out.println(Calculadora.suma(2, 2));
		System.out.println(Calculadora.resta(2, 2));

	}

}
