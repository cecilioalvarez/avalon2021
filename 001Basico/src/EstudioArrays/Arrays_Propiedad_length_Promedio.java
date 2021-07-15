package EstudioArrays;

public class Arrays_Propiedad_length_Promedio {

	public static void main(String[] args) {

		double suma=0;
		int[] listaNumeros= new int[] {5,3,8,23};
		
		for (int i=0;i<listaNumeros.length;i++) {
			System.out.println(listaNumeros[i]);
			suma=suma+listaNumeros[i];
		}

		System.out.println(suma/listaNumeros.length);

	}

}
