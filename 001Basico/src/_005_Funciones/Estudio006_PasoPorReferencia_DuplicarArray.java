package _005_Funciones;

public class Estudio006_PasoPorReferencia_DuplicarArray {

	public static void main(String[] args) {

		int[] lista = new int[] { 1, 2, 3 };
		imprimir(lista);
		int [] lista2 =duplicar(lista);
		imprimir(lista2);
		imprimir(lista);

	}

	static void imprimir(int[] listaoriginal) {
		for (int i = 0; i < listaoriginal.length; i++) {
			System.out.println(listaoriginal[i]);
		}
	}

	//esta funcion crea una nueva lista con los datos de la lista original
	//el tamaño es igual al de la lista original
	//es una variable que pertenece a la funcion por lo tanto utilizo return
	static int[] duplicar(int[] elementos) {
		int [] nuevalista = new int [elementos.length];
		for (int i = 0; i < elementos.length; i++) {
			nuevalista[i] = elementos[i] * 5;
		}
		return nuevalista;
	}
	
}
