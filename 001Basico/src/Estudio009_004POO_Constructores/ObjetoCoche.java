package Estudio009_004POO_Constructores;

public class ObjetoCoche {

	public static void main(String[] args) {
		//al contruir el constructor la creacion del objeto ya no se podría hacer asi:
		//Coche c1=new Coche();
		//c1.setMarca("toyota");
		//c1.setModelo("corolla");
		//como vemos en el codigo sigueinte nos hemos ahorrado 2 lineas de codigo
		//adicionalmente nos obliga a pasar los dos parametros del coche y no los parametros por separado
		Coche c1=new Coche("toyota","corolla");
		
		System.out.println(c1.getMarca());
		
		
		System.out.println(c1.getModelo());
		
	}

}
