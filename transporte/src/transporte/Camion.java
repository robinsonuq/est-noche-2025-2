package transporte;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

	List<T> cajas = new ArrayList<>();
	
	public void cargar(T t){
		cajas.add(t);
	}
	
	public T descargar(int index) {
		return cajas.get(index);
	}

	@Override
	public Iterator<T> iterator() {
		
		return new CamionIterator(cajas);
	}
	
	
}
