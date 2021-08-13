package _004b_OrdenamientoArrays.BubbleSort;

public class BubbleSort {

	//defino dos metodos para el objeto lista, uno de imprimir y otro de ordenar
	//si queisieramos ordenar texto o otras cosas pues lo que hacemos es definir 
	//los array con su respectivo tipo(double, string, etc
	public void ordenamientoBurbuja(int[] array) {
		int aux;
		boolean cambios = false;

		while (true) {
			cambios = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					aux = array[i];
					array[i] = array[i - 1];
					array[i - 1] = aux;
					cambios = true;
				}
			}
			if (cambios == false) {
				break;
			}
		}

	}

	public void imprimir(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
