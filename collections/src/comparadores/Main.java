package comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Robinson", 40);
		Cliente cliente2 = new Cliente("Raul1", 30);
		Cliente cliente3 = new Cliente("Rauls", 10);
		Cliente cliente4 = new Cliente("Raulr", 20);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cliente);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		listaClientes.add(cliente4);
		
		Collections.sort(listaClientes,new CedulaComparator());
		
		Collections.sort(listaClientes,new Comparator<Cliente>() {

			@Override
			public int compare(Cliente o1, Cliente o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		System.out.println();
	}
}
