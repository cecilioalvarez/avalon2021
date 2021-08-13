package _004_Arrays_Matrices;

public class Estudio003_Arrays_Propiedad_length2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista = new int[5];
		lista[0] = 4;
		lista[1] = 5;
		lista[2] = 7;
		lista[3] = 8;
		lista[4] = 9;

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

		System.out.println("__________________________");

		for (int j = 0; j < lista.length; j++) {
			lista[j] = lista[j] + 1;
			System.out.println(lista[j]);
		}

	}

}
