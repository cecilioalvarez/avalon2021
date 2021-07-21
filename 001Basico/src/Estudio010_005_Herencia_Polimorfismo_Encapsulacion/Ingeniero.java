package Estudio010_005_Herencia_Polimorfismo_Encapsulacion;

public class Ingeniero extends Persona {

	public Ingeniero(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void andar() {
		imprimeTextoAndar();
		System.out.println("3 k/h");
	}
}
