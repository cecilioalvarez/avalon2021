package _004b_OrdenamientoArrays.BubbleSort;

public class Principal {

	public static void main(String[] args) {

		int[] listaNumeros= new int[] {5,3,8,9,7,2,1};
		
		
		//llamo a la clase Bubblesort para poder utilizar los metodos ordenamiento e imprimir
		BubbleSort l=new BubbleSort();
		l.ordenamientoBurbuja(listaNumeros);
		l.imprimir(listaNumeros);

	}

}
