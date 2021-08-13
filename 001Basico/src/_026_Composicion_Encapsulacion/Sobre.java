package _026_Composicion_Encapsulacion;

public class Sobre {
	
	private String color;
	
	//para hacer una relacion de una a uno debemos crear una variable que contenga al otro programa
	private Galleta galleta;
	//para mejorar el anterior programa creamos el constructor de sobre
	//para que este reciba el parametro color y el parametro de galleta
	


		public Sobre(String color, String sabor,double precio) {
		super();
		this.color = color;
		this.galleta = new Galleta(sabor, precio);
	}

		public String getSabor() {
			return galleta.getSabor();
		}

		public void setSabor(String sabor) {
			galleta.setSabor(sabor);
		}

		

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
public double getPrecio() {
	return 0.1+galleta.getPrecio();
}
}
