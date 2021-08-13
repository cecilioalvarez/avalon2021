package _025_Composicion_RelacionUnoaUno;

public class Sobre {
	
	private String color;
	
	//para hacer una relacion de una a uno debemos crear una variable que contenga al otro programa
		private Galleta galleta;
		

	public Galleta getGalleta() {
			return galleta;
		}

		public void setGalleta(Galleta galleta) {
			this.galleta = galleta;
		}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
