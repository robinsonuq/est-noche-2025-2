package listaSimple;

import java.util.Iterator;

public class ListaSimpleIterador implements Iterator<Integer> {

	Nodo aux;
	
	public ListaSimpleIterador(Nodo primero) {
		aux = primero;
	}
	
	@Override
	public boolean hasNext() {
		
		return aux.getSiguiente() != null;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return aux.getSiguiente();
	}

}
