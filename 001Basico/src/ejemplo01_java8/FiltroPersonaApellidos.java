package ejemplo01_java8;

public class FiltroPersonaApellidos implements FiltroPersona {

	private String apellido;

	public FiltroPersonaApellidos(String apellido) {
		super();
		this.apellido = apellido;
	}

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		return persona.getApellidos().equals(apellido);
	}

}
