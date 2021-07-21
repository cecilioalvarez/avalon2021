package practica1_SQL_Telefono;

import java.util.ArrayList;
import java.util.List;



public class Main_Practica1 {

	public static void main(String[] args) {
		
		List<Telefono> myPhonesList = new ArrayList<Telefono>();
		
		Telefono tel1 = new Telefono(2, "samsung", 399.95);
		
		tel1.addPhone();
		
		System.out.println("");
		System.out.println("Listado tras insert------------------------------");
		System.out.println("");
		myPhonesList=Telefono.getAllPhones();
		for (Telefono tel : myPhonesList) {
			System.out.println(tel.toString());
		}
		
		System.out.println("");
		System.out.println("Busqueda por Marca------------------------------");
		System.out.println("");
		myPhonesList=Telefono.getPhonebyBrand("samsung");
		for (Telefono tel : myPhonesList) {
			System.out.println(tel.toString());
		}
		
		System.out.println("");
		System.out.println("Listado tras modify------------------------------");
		System.out.println("");
		tel1.modifyPhoneBrand("LG");
		tel1.modifyPhonePrice(599.28);
		myPhonesList=Telefono.getAllPhones();
		for (Telefono tel : myPhonesList) {
			System.out.println(tel.toString());
		}
		
		System.out.println("");
		System.out.println("Listado tras delete------------------------------");
		System.out.println("");
		tel1.removePhone();
		myPhonesList=Telefono.getAllPhones();
		for (Telefono tel : myPhonesList) {
			System.out.println(tel.toString());
		}
		
		System.out.println("");
		System.out.println("Encuentra 1 por numero------------------------------");
		System.out.println("");
		tel1=Telefono.getPhone(1);
		myPhonesList=Telefono.getAllPhones();
		System.out.println(tel1.toString());

	}

}
