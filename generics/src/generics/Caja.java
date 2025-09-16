package generics;

import java.util.ArrayList;

public class Caja<C,D> {

	private ArrayList<C> listaC = new ArrayList<>();
	private ArrayList<D> listaD = new ArrayList<>();
	
	public void add(C c) {
		listaC.add(c);
	}
	
	
	public C sacarC(int posicion) {
		return listaC.get(posicion);
	}
	public void remove(int posicion) {
		listaC.remove(posicion);
	}
}
