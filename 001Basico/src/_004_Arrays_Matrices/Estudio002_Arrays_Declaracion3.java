package _004_Arrays_Matrices;

public class Estudio002_Arrays_Declaracion3 {

	public static void main(String[] args) {
		
		// como se declara un Array
		// la siguiente declaracion de lista tiene un tamaño de 3 y va a contener numeros
		int lista[]; 
		lista= new int[3];
		
		// ahora a cada posicion le asigno un valor
		
		lista[0]=5;
		lista[1]=3;
		lista[2]=8;
		
		//accedemos a cada posicion
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		
		
	}

}
