package EstudioArrays;

public class Arrays_Propiedad_length_NuevoArray {

	public static void main(String[] args) {

		int[] listaNumeros= new int[] {5,3,8,9,7,2,1};
		int numeroAprobados=0;
		
		for (int i=0;i<listaNumeros.length;i++) {
			if (listaNumeros[i]>=5) {
				numeroAprobados++;
			}
		}		
		//System.out.println(numeroAprobados);
		
		int[] listaAprobados= new int[numeroAprobados];
		int posicionAprobados=0;
		for (int i=0;i<listaNumeros.length;i++) {
			if (listaNumeros[i]>=5) {
				listaAprobados[posicionAprobados]=listaNumeros[i];
				System.out.println(listaAprobados[posicionAprobados]);
			}
		}		
	}
}
