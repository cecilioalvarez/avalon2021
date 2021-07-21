package Estudio010_005_Herencia_Polimorfismo_Encapsulacion;

public class Principal {

	public static void main(String[] args) {

// uso del polimorfismo
		// se ejecuta el metodo deportista, auqnue yo apunte con persona
		Persona p1 = new Deportista("juan");
		iniciarAndar(p1);
		Persona p2 = new Ingeniero("ana");
		iniciarAndar(p2);
		Persona p3 = new Persona("toto");
		iniciarAndar(p3);

	}

	
	
	//este metodo recibe una persona y lo pone andar
	//esto es muy util por que oculta por completo una jerarquia de clase
	//es decir que el programador que use este metodo
	//no necesita saber que existe un ingeniero o deportista
	//a esto le llamamos encapsulacion
	public static void iniciarAndar(Persona p) {
		p.andar();
	}
}
