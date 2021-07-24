package Estudio001;

public class Estudio011_Switch {

	public static void main(String[] args) {
		
		String dia="viernes";
		
		switch (dia) {
		case "lunes":
			System.out.println("que pena, inicio de semana");
			break;
		case "martes":
			System.out.println("vamos avanzando");
			break;
		case "miercoles":
			System.out.println("mitad de semana");
			break;
		case "jueves":
			System.out.println("juernes");
			break;
		case "viernes":
			System.out.println("se llega el fin de semana");
			break;
		default:
			System.out.println("es fin de semana");
			break;	
		}

	}

}
