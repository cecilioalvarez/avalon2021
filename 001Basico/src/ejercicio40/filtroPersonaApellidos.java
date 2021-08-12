package ejercicio40;

public class filtroPersonaApellidos implements FiltroPersona {

	
	private String apellidos;
	
	
	public filtroPersonaApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}


	@Override
	public boolean test(Persona persona) {
		return persona.getApellidos().equals(apellidos);
	}
	

}
