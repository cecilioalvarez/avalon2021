package _004b_OrdenamientoArrays.QuickSort;

public class QuickSort {

	// defino dos metodos para el objeto lista, uno de imprimir y otro de ordenar
	// si queisieramos ordenar texto o otras cosas pues lo que hacemos es definir
	// los array con su respectivo tipo(double, string, etc
	
	public void ordenamientoQuickSort(int[] array) {
		array=quicksort1(array);
	}
	
	public static int[] quicksort1(int numeros[]) {
		return quicksort2(numeros,0,numeros.length-1);
	}
	

	public static int[] quicksort2(int numeros[], int izq, int der) {
		if (izq >= der)
			return numeros;
		int i = izq;
		int d = der;
		if (izq != der) {
			int pivote;
			int aux;
			pivote = izq;
			while (izq != der) {
				while (numeros[der] >= numeros[pivote] && izq < der)
					der--;
				while (numeros[izq] < numeros[pivote] && izq < der)
					izq++;
				if (der != izq) {
					aux = numeros[der];
					numeros[der] = numeros[izq];
					numeros[izq] = aux;
				}
			}
			if (izq == der) {
				quicksort2(numeros, i, izq - 1);
				quicksort2(numeros, izq + 1, d);
			}
		} else
			return numeros;
		return numeros;
	}

	public void imprimirQuickSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
