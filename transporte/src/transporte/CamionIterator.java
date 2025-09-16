package transporte;

import java.util.Iterator;
import java.util.List;

public class CamionIterator<T> implements Iterator<T> {
	
	private List<T> cajas;
	int indice;

	public CamionIterator(List<T> cajas) {
		this.cajas = cajas;
		indice = 0;
	}

	@Override
	public boolean hasNext() {
		return indice < cajas.size();
	}

	@Override
	public T next() {
		
		T t = cajas.get(indice);
		if(indice < cajas.size()) {
			indice+=2;
		}else {
			throw new IndexOutOfBoundsException();
		}

		return t;
	}

}
