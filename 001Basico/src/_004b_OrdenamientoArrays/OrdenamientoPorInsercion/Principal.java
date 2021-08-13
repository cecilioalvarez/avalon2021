package _004b_OrdenamientoArrays.OrdenamientoPorInsercion;

public class Principal {

	public static void main(String[] args) {

		int[] listaNumeros= new int[] {5,3,8,9,7,5,9,1,90,3,2,1};
		
		
		//llamo a la clase Bubblesort para poder utilizar los metodos ordenamiento e imprimir
		OrdenamientoPorInsercion l=new OrdenamientoPorInsercion();
		l.ordenamientoInsercion(listaNumeros);
		l.imprimirInsercion(listaNumeros);

	}

}
