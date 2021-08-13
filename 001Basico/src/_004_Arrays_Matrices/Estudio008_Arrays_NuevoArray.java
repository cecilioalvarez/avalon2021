package _004_Arrays_Matrices;

public class Estudio008_Arrays_NuevoArray {

	public static void main(String[] args) {

		//contar el numero de calificaciones que cumplen el criterio de ser 
		//mayores o iguales a 5
		int[] listaNumeros= new int[] {5,3,8,9,7,2,1};
		int numeroAprobados=0;
		
		for (int i=0;i<listaNumeros.length;i++) {
			if (listaNumeros[i]>=5) {
				numeroAprobados++;
			}
		}		
		System.out.println(numeroAprobados);
		System.out.println("--------------------------");
		
		//crear nueva lsita con el numero que ha salido al contar el numero de aprobados 
		// y asignarle el mnumero que le corresponde a cada posicion
		int[] listaAprobados= new int[numeroAprobados];
		int posicionAprobados=0;
		for (int i=0;i<listaNumeros.length;i++) {
			if (listaNumeros[i]>=5) {
				listaAprobados[posicionAprobados]=listaNumeros[i];
				posicionAprobados++;
			}
		}
		//sacar en pantalla el tamaño del Array
		System.out.println(listaAprobados.length);
		// sacar en pantalla el valor de cada elemento del Array
		System.out.println(listaAprobados[0]);
		System.out.println(listaAprobados[1]);
		System.out.println(listaAprobados[2]);
		System.out.println(listaAprobados[3]);
		// la otra forma mas elegante de sacar en pantalla el valor de cada elemento del Array
		for (int i=0;i<listaAprobados.length;i++) {
			System.out.println("posicion :"+i+" valor :"+listaAprobados[i]);
		}
	}
}
