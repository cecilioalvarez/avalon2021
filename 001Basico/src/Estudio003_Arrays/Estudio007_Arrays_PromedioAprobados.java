package Estudio003_Arrays;

public class Estudio007_Arrays_PromedioAprobados {

	public static void main(String[] args) {

		double sumaAprobados=0;
		double sumaCumpleCriterio=0;
		int[] listaNumeros= new int[] {5,3,8,9,7,2,1};
		
		for (int i=0;i<listaNumeros.length;i++) {
			if (listaNumeros[i]>=5) {
				sumaAprobados=sumaAprobados+listaNumeros[i];
				sumaCumpleCriterio++;
			}
		}
		System.out.println(sumaAprobados);
		System.out.println(sumaCumpleCriterio);
		System.out.println("el promedio de las notas altas es: "+sumaAprobados/sumaCumpleCriterio);

	}

}
