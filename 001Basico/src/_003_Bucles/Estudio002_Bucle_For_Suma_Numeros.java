package _003_Bucles;

public class Estudio002_Bucle_For_Suma_Numeros {

	public static void main(String[] args) {
		
		int suma2=0;
		for (int s=0;s<=5;s++) {
			suma2= suma2+s;
		}
		System.out.println("el total es " + suma2);
		
		System.out.println("_____________________________________");
		
		int suma=0;
		for (int i=0;i<=5;i++) {
			System.out.println("iteracion "+i);
			suma= suma+i;
			System.out.println("la suma va en "+suma);
		}
		System.out.println("el total es " + suma);

	}

}
