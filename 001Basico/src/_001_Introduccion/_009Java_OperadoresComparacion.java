package _001_Introduccion;

public class _009Java_OperadoresComparacion {

	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 7;
		int numero3 = 5;
		
		//el doble igual es un operador de compraracion, 
		//mienstras que el = sencillo es de asignacion
		//>, <, >=, <=, ==, ||, &&, !
		// ! esta quiere decir que cambia el sentido de la respuesta
		System.out.println(numero1==numero2);
		System.out.println(numero1!=numero2);
		System.out.println(numero1 > numero2); 
		System.out.println(numero1 < numero2);
		
		//veamos como ! cambia el sentido del resultado
		System.out.println(!(numero1 < numero2)); 
		
	}

}
