package _023_Herencia_Casting;

public class Principal {

	public static void main(String[] args) {

	Persona p1 =new Deportista("juan", "tennis");
	
	
	System.out.println(p1.getNombre());
	p1.andar();
	//el problema es que si le doy p1. no me aparece la opcion de deporte para poder imprimir el deporte.
	//en este caso debemso forzar al programa para que lo haga
	// para esto me creo otra variable
	//cuando salga el error le damos que se obligue a sacar el concepto de casting
	Deportista p=(Deportista) p1;
	System.out.println(p.getDeporte());

	}

}
