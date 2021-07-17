package Estudio004_Funciones;

public class Estudio005_PasoPorReferencia2 {

	public static void main(String[] args) {
		
		int[] lista1 = new int[] {1,2,3};
		// en este caso estoy generando una copia de la lista original
		for (int i=0;i<lista1.length;i++) {
			lista1[i]=lista1[i]*2;
			System.out.println(lista1[i]);
		}
		
		System.out.println("__________________________");
		
		//en este caso se pasa una referencia a la lista original para modificar los
		//valores dentro de la lsita
		//por lo tanto los elementos de la funcion recibe una lista original
		
		int[] lista = new int[] {1,2,3};
		multiplicar(lista);
		
		// para convertir un codigo en funcion o metodo con Eclipse lo que debemos hacer es:
		//click derecho>refactor>extract method...
		imprimir(lista);
		
	}

	//esta funcion o metodo lo podemos hacer automaticamente a partir de eclipse
	//en Java todos los metodos o funciones deben ir en minuscula, esto es una regla
	static void imprimir(int[] lista) {
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	
	static void multiplicar(int[] elementos) {
		for (int i=0;i<elementos.length;i++) {
			elementos[i]=elementos[i]*5;
		}
	}
}
