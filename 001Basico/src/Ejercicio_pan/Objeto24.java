package Ejercicio_pan;

public class Objeto24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pan mipan=FactoriaPan.getPan("baggete",1,"harina fina");
		System.out.println(mipan.getPeso());
		System.out.println(mipan.getIngrediente());
		mipan.cocer();
	}

}
