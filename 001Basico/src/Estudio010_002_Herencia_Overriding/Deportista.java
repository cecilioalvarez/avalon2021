package Estudio010_002_Herencia_Overriding;

public class Deportista extends Persona {

	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	// he sobreescribido el metodo de la clase persona por esta
	// este metodo se puede generar desde el asistente de Eclipse
	// click derecho>source>override/implement Method
	//este metodo debería existir en la clase persona, de lo contrario no compilaría

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println(getNombre()+" anda a 10 k/h");
	}
	
	

}
