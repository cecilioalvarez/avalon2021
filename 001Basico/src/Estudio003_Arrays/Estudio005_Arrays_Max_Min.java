package Estudio003_Arrays;

public class Estudio005_Arrays_Max_Min {

	public static void main(String[] args) {

		int[] listaNumeros= new int[] {5,3,8,9,1,0,-8,100000};
		int mayor=listaNumeros[0];
		
		for (int i=0;i<listaNumeros.length;i++) {
			if (mayor<listaNumeros[i]) {
				mayor=listaNumeros[i];
				//System.out.println("cambio");
			}
		}
		System.out.println("el numero mayor es: "+mayor);
		
		int menor=listaNumeros[0];
		
		for (int i=0;i<listaNumeros.length;i++) {
			if (menor>listaNumeros[i]) {
				menor=listaNumeros[i];
			}
		}
		System.out.println("el numero menor es: "+menor);
	}

}
