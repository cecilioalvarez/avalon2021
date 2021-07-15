package EstudioArrays;

public class Arrays_Propiedad_length {

	public static void main(String[] args) {


		int[] listaNumeros= new int[] {5,3,8,14,5,9,21};
		
		// la propiedad length cuenta el nuemro de elemntos del Array
		System.out.println(listaNumeros.length);
		
		
		System.out.println("_____________________");
		
		for (int i=0;i<listaNumeros.length;i++) {
			System.out.println("posicion :"+i+" valor :"+listaNumeros[i]);
		}

	}

}
