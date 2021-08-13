package _004b_OrdenamientoArrays.OrdenamientoPorInsercion;

public class OrdenamientoPorInsercion {

	// defino dos metodos para el objeto lista, uno de imprimir y otro de ordenar
	// si queisieramos ordenar texto o otras cosas pues lo que hacemos es definir
	// los array con su respectivo tipo(double, string, etc
	public void ordenamientoInsercion(int[] array) {

		int aux;
		int contA;
		int contB;
		for (contA = 1; contA < array.length; contA++) {
			aux = array[contA];
			for (contB = contA - 1; contB >= 0 && array[contB] > aux; contB--) {
				array[contB + 1] = array[contB];
				array[contB] = aux;
			}
		}
	}

	public void imprimirInsercion(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
