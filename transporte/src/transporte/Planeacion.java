package transporte;

import java.util.ArrayList;
import java.util.Iterator;

public class Planeacion {

	
	public static void main(String[] args) {
		
		Camion<String> camion1 = new Camion<>();
		
		camion1.cargar("Manzana");
		camion1.cargar("Manzana");
		camion1.cargar("Naranja");
		
	
		for (String string : camion1) {
			System.out.println(string);
		}
		Iterator<String> iterator = camion1.iterator();
		
		
		Thread trThread = new Thread();
		trThread.setDaemon(false);
		
		while(iterator.hasNext()) {
			String objetoCamion = iterator.next();
			System.out.println(objetoCamion);
		}
		iterator.next();
	}
}
