package EstudioArrays;

public class Arrays_Ordenamiento {

	public static void main(String[] args) {
		
		int[] listaNumeros= new int[] {5,3,8,9,7,2,1};
		boolean noOrdenado=true;
		
		while (noOrdenado) {
			noOrdenado=false;
			for (int i=0;i<listaNumeros.length-1;i++) {
				if (listaNumeros[i]>listaNumeros[i+1]) {
					int temporal=listaNumeros[i];
					listaNumeros[i]=listaNumeros[i+1];
					listaNumeros[i+1]=temporal;
					noOrdenado=true;
				}
			}
		}
		
		for (int i=0;i<listaNumeros.length;i++) {
			System.out.println(listaNumeros[i]);
		}
	}

}
