package ejemplo04;

public class Main {
	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.setMarca("Samsung");
		tv.setPrecio(1000);
		tv.setIsEncendido(false);
		
		
		Television tv2 = new Television("Samusung", 2000, true);
		System.out.println(tv2.getIsEncendido());
		tv.on();
		System.out.println(tv2.getIsEncendido());
		tv.of();
		
	}

}
