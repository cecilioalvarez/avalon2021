package _004_Arrays_Matrices;

public class Estudio003_Arrays_Propiedad_length {

	public static void main(String[] args) {


		int[] listaNumeros= new int[] {5,3,8,14,5,9,21};
		
		// la propiedad length cuenta el numero de elementos del Array
		System.out.println(listaNumeros.length);
		
		
		System.out.println("_____________________");
		
		for (int i=0;i<listaNumeros.length;i++) {
			System.out.println("posicion :"+i+" valor :"+listaNumeros[i]);
		}

	}

}
