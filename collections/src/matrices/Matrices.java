package matrices;

import java.util.ArrayList;
import java.util.Iterator;

public class Matrices {

		
	public static void main(String[] args) {
		

		ArrayList<String> listaEmpleados = new ArrayList<>();
		listaEmpleados.add("Robinson");
		listaEmpleados.add("Roberto");
		listaEmpleados.add("Raul");
		
		
		Iterator<String> iterator = listaEmpleados.iterator();
		
		while(iterator.hasNext()) {
			String nombre = iterator.next();
			if(nombre.startsWith("R")) {
				iterator.remove();
			}
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
//		for (String nombre : listaEmpleados) {
//			if(nombre.startsWith("R")) {
//				listaEmpleados.remove(nombre);
//			}
//		}
		
		
		
		
		
//		for (int i = 0; i < listaEmpleados.size(); i++) {
//			if(listaEmpleados.get(i).charAt(0) == 'R') {
//				listaEmpleados.remove(i);
//				i--;
//			}
//		}
		
		System.out.println();
		
	}
}
