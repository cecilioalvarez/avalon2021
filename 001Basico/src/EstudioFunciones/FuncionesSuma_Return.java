package EstudioFunciones;

public class FuncionesSuma_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=5;
		int numero2=6;
		int numero3=5;
		int numero4=6;
		int resultado=suma(numero1,numero2)+suma(numero3,numero4);
		System.out.println(resultado);
		
	}
	//el void se remplaza por int y el print por return
	static int suma (int a,int b) {
		return a+b;
	}
}
