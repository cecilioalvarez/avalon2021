package Estudio003_Arrays;

public class Estudio001_Arrays_Declaracion {

	public static void main(String[] args) {
		// como se declara un Array
		// la siguiente declaracion de lista tiene un tamaño de 3 y va a contener numeros
		int[] listaNumeros= new int[3];
		//accedemos a cada posicion
		System.out.println(listaNumeros[0]);
		System.out.println(listaNumeros[1]);
		System.out.println(listaNumeros[2]);
		
		// ahora a cada posicion le asigno un valor
		
		listaNumeros[0]=5;
		listaNumeros[1]=3;
		listaNumeros[2]=8;
		
		System.out.println(listaNumeros[0]);
		System.out.println(listaNumeros[1]);
		System.out.println(listaNumeros[2]);
	}

}
