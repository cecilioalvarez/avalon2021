package ejemplos40_Java8_Intro;

public class FiltroPersonaApellidos implements FiltroPersona{

	private String apellidos;
	
	public FiltroPersonaApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}

	@Override
	public boolean test(Persona persona) {
		return persona.getApellidos().equals(apellidos);
	}

}
