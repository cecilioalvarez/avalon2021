package ejemplo40_java8;

public class FiltroPersonaApellidos implements FiltroPersona {

	private String apellidos;


	public FiltroPersonaApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}


	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		return persona.getApellidos().equals(apellidos);
	}

}